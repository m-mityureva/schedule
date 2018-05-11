package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import vsu.data_operations.repositories.TeacherRepository;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
}
