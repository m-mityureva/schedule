package vsu.data_operations.converters;

import vsu.data_operations.dto.TeacherDTO;
import vsu.data_operations.dto.TeacherSubjectDTO;
import vsu.data_operations.entities.Teacher;
import vsu.data_operations.entities.TeacherSubject;

import java.util.LinkedList;
import java.util.List;

public class TeacherConverter {
    public static Teacher DTO_to_Entity(TeacherDTO teacherDTO){
        if(teacherDTO == null)
            return null;
        Teacher teacher = new Teacher();

        teacher.setFull_name(teacherDTO.getFull_name());
        teacher.setId(teacherDTO.getId());
        teacher.setMail(teacherDTO.getMail());

        List<TeacherSubject> teacher_subjects = new LinkedList<>();
        List<TeacherSubjectDTO> teacherSubjectDTOS = teacherDTO.getTeacherSubjectDTOS();
        for(TeacherSubjectDTO t : teacherSubjectDTOS){
            teacher_subjects.add(TeacherSubjectConverter.DTO_to_Entity(t));
        }
        teacher.setTeacherSubjects(teacher_subjects);

        return teacher;
    }

    public static TeacherDTO Entity_To_DTO(Teacher teacher){
        if(teacher == null)
            return null;
        TeacherDTO teacherDTO = new TeacherDTO();

        teacherDTO.setFull_name(teacher.getFull_name());
        teacherDTO.setId(teacher.getId());
        teacherDTO.setMail(teacher.getMail());

        List<TeacherSubject> teacher_subjects = teacher.getTeacherSubjects();
        List<TeacherSubjectDTO> teacherSubjectDTOS = new LinkedList<>();
        for(TeacherSubject t : teacher_subjects){
            teacherSubjectDTOS.add(TeacherSubjectConverter.Entity_To_DTO(t));
        }
        teacherDTO.setTeacherSubjectDTOS(teacherSubjectDTOS);

        return teacherDTO;
    }
}
