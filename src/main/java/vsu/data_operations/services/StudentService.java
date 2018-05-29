package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vsu.data_operations.converters.StudentConverter;
import vsu.data_operations.dto.StudentDTO;
import vsu.data_operations.repositories.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Transactional
    public StudentDTO add(StudentDTO cd){
        return StudentConverter.Entity_To_DTO(studentRepository.save(StudentConverter.DTO_to_Entity(cd)));
    }
}
