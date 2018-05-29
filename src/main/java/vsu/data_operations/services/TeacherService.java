package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vsu.data_operations.converters.TeacherConverter;
import vsu.data_operations.dto.TeacherDTO;
import vsu.data_operations.repositories.TeacherRepository;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Transactional
    public TeacherDTO add(TeacherDTO cd){
        return TeacherConverter.Entity_To_DTO(teacherRepository.save(TeacherConverter.DTO_to_Entity(cd)));
    }
}
