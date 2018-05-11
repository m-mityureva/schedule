package vsu.data_operations.converters;

import vsu.data_operations.dto.ClassroomDTO;
import vsu.data_operations.dto.TeacherSubjectDTO;
import vsu.data_operations.entities.Classroom;
import vsu.data_operations.entities.Teacher_Subject;

import java.util.LinkedList;
import java.util.List;

public class ClassroomConverter {
    public static Classroom DTO_to_Entity(ClassroomDTO classroomDTO){
        if(classroomDTO == null)
            return null;
        Classroom classroom = new Classroom();

        classroom.setAvailable(classroomDTO.isAvailable());
        classroom.setNumber(classroomDTO.getNumber());
        classroom.setType(classroomDTO.getType());
        classroom.setId(classroomDTO.getId());

        List<TeacherSubjectDTO> dtos = classroomDTO.getTeacherSubjectDTOS();
        List<Teacher_Subject> entities = new LinkedList<>();
        for (TeacherSubjectDTO t : dtos) {
            entities.add(TeacherSubjectConverter.DTO_to_Entity(t));
        }
        classroom.setTeacher_subjects(entities);
        return classroom;
    }

    public static ClassroomDTO Entity_to_DTO(Classroom classroom){
        if(classroom == null)
            return null;
        ClassroomDTO classroomDTO = new ClassroomDTO();

        classroomDTO.setAvailable(classroom.isAvailable());
        classroomDTO.setNumber(classroom.getNumber());
        classroomDTO.setType(classroom.getType());
        classroomDTO.setId(classroom.getId());

        List<TeacherSubjectDTO> dtos = new LinkedList<>();
        List<Teacher_Subject> entities = classroom.getTeacher_subjects();
        for (Teacher_Subject t : entities) {
            dtos.add(TeacherSubjectConverter.Entity_To_DTO(t));
        }
        classroomDTO.setTeacherSubjectDTOS(dtos);

        return classroomDTO;
    }
}
