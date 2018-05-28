package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vsu.data_operations.converters.ClassroomConverter;
import vsu.data_operations.dto.ClassroomDTO;
import vsu.data_operations.repositories.ClassroomRepository;

@Service
public class ClassroomService {
    private final ClassroomRepository classroomRepository;

    public ClassroomService(ClassroomRepository classroomRepository){
        this.classroomRepository = classroomRepository;
    }

    @Transactional
    public ClassroomDTO add(ClassroomDTO cd){
        return ClassroomConverter.Entity_to_DTO(classroomRepository.save(ClassroomConverter.DTO_to_Entity(cd)));
    }
}
