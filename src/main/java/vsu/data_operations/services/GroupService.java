package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vsu.data_operations.converters.GroupConverter;
import vsu.data_operations.dto.GroupDTO;
import vsu.data_operations.entities.Group;
import vsu.data_operations.repositories.GroupRepository;

import java.util.LinkedList;
import java.util.List;

@Service
public class GroupService {
    private final GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository){
        this.groupRepository = groupRepository;
    }

    @Transactional
    public GroupDTO add(GroupDTO groupDTO){
       return GroupConverter.Entity_to_DTO(groupRepository.save(GroupConverter.DTO_to_Entity(groupDTO)));
    }

    public Iterable<GroupDTO> getAll(){
        Iterable<Group> groups = groupRepository.findAll();
        List<GroupDTO> groupDTOS = new LinkedList<>();
        for(Group g : groups){
            groupDTOS.add(GroupConverter.Entity_to_DTO(g));
        }
        return groupDTOS;
    }

    public Iterable<Integer> getCourseNumbers(){
        return groupRepository.getAllCourses();
    }

    public Iterable<Integer> getGroupsFromCourse(int course){
        return groupRepository.getAllCourseGroups(course);
    }
}
