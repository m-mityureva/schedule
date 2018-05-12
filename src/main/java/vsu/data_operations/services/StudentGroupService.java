package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vsu.data_operations.converters.StudentGroupConverter;
import vsu.data_operations.dto.StudentGroupDTO;
import vsu.data_operations.entities.StudentGroup;
import vsu.data_operations.repositories.StudentGroupRepository;

import java.util.LinkedList;
import java.util.List;

@Service
public class StudentGroupService {
    private final StudentGroupRepository studentGroupRepository;

    public StudentGroupService(StudentGroupRepository studentGroupRepository){
        this.studentGroupRepository = studentGroupRepository;
    }

    @Transactional
    public StudentGroupDTO add(StudentGroupDTO groupDTO){
       return StudentGroupConverter.Entity_to_DTO(studentGroupRepository.save(StudentGroupConverter.DTO_to_Entity(groupDTO)));
    }

    public Iterable<StudentGroupDTO> getAll(){
        Iterable<StudentGroup> groups = studentGroupRepository.findAll();
        List<StudentGroupDTO> groupDTOS = new LinkedList<>();
        for(StudentGroup g : groups){
            groupDTOS.add(StudentGroupConverter.Entity_to_DTO(g));
        }
        return groupDTOS;
    }

    public Iterable<Integer> getCourseNumbers(){
        return studentGroupRepository.getAllCourses();
    }

    public Iterable<Integer> getGroupsFromCourse(int course){
        return studentGroupRepository.getAllCourseGroups(course);
    }
}
