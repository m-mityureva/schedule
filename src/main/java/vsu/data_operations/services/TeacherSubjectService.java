package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vsu.data_operations.converters.TeacherSubjectConverter;
import vsu.data_operations.dto.TeacherSubjectDTO;
import vsu.data_operations.repositories.TeacherSubjectRepository;

@Service
public class TeacherSubjectService {
    private final TeacherSubjectRepository teacherSubjectRepository;

    public TeacherSubjectService(TeacherSubjectRepository teacherSubjectRepository) {
        this.teacherSubjectRepository = teacherSubjectRepository;
    }

    @Transactional
    public TeacherSubjectDTO add(TeacherSubjectDTO cd){
        return TeacherSubjectConverter.Entity_To_DTO(teacherSubjectRepository.save(TeacherSubjectConverter.DTO_to_Entity(cd)));
    }
}
