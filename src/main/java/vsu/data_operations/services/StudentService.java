package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import vsu.data_operations.repositories.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
