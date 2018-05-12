package vsu.data_operations.converters;

import vsu.data_operations.dto.SubjectDTO;
import vsu.data_operations.dto.TeacherSubjectDTO;
import vsu.data_operations.entities.Subject;
import vsu.data_operations.entities.TeacherSubject;

import java.util.LinkedList;
import java.util.List;

public class SubjectConverter {
    public static Subject DTO_to_Entity(SubjectDTO subjectDTO){
        if(subjectDTO == null)
            return null;
        Subject subject = new Subject();

        subject.setId(subjectDTO.getId());
        subject.setNaming(subjectDTO.getNaming());

        List<TeacherSubjectDTO> dtos = subjectDTO.getTeacherSubjectDTOS();
        List<TeacherSubject> entities = new LinkedList<>();
        for (TeacherSubjectDTO t : dtos) {
            entities.add(TeacherSubjectConverter.DTO_to_Entity(t));
        }
        subject.setTeacherSubjects(entities);

        return subject;
    }

    public static SubjectDTO Entity_To_DTO(Subject subject){
        if(subject == null)
            return null;
        SubjectDTO subjectDTO = new SubjectDTO();

        subjectDTO.setId(subject.getId());
        subjectDTO.setNaming(subject.getNaming());

        List<TeacherSubjectDTO> dtos = new LinkedList<>();
        List<TeacherSubject> entities = subject.getTeacherSubjects();
        for (TeacherSubject t : entities) {
            dtos.add(TeacherSubjectConverter.Entity_To_DTO(t));
        }
        subjectDTO.setTeacherSubjectDTOS(dtos);

        return subjectDTO;
    }
}
