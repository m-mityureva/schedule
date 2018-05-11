package vsu.data_operations.converters;

import vsu.data_operations.dto.StudentDTO;
import vsu.data_operations.entities.Student;

public class StudentConverter {
    public static Student DTO_to_Entity(StudentDTO studentDTO){
        if(studentDTO == null)
            return null;

        Student student = new Student();

        student.setGroup(GroupConverter.DTO_to_Entity(studentDTO.getGroup()));
        student.setGroup_praetorian(GroupConverter.DTO_to_Entity(studentDTO.getGroup_praetorian()));
        student.setId(studentDTO.getId());
        student.setMail(studentDTO.getMail());

        return student;
    }

    public static StudentDTO Entity_To_DTO(Student student){
        if(student == null)
            return null;

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setGroup(GroupConverter.Entity_to_DTO(student.getGroup()));
        studentDTO.setGroup_praetorian(GroupConverter.Entity_to_DTO(student.getGroup_praetorian()));
        studentDTO.setId(student.getId());
        studentDTO.setMail(student.getMail());

        return studentDTO;
    }
}
