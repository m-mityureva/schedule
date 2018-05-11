package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import vsu.data_operations.repositories.TeacherSubjectRepository;

@Service
public class TeacherSubjectService {
    private final TeacherSubjectRepository teacherSubjectRepository;

    public TeacherSubjectService(TeacherSubjectRepository teacherSubjectRepository) {
        this.teacherSubjectRepository = teacherSubjectRepository;
    }
}
