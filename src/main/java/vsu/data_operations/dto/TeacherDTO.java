package vsu.data_operations.dto;

import java.util.LinkedList;
import java.util.List;

public class TeacherDTO {
    private long id;

    private String full_name;

    private String mail;

    private List<TeacherSubjectDTO> teacherSubjectDTOS;

    public TeacherDTO(){
        teacherSubjectDTOS = new LinkedList<>();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<TeacherSubjectDTO> getTeacherSubjectDTOS() {
        return teacherSubjectDTOS;
    }

    public void setTeacherSubjectDTOS(List<TeacherSubjectDTO> teacherSubjectDTOS) {
        this.teacherSubjectDTOS = teacherSubjectDTOS;
    }
}
