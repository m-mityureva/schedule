package vsu.data_operations.dto;

import java.util.LinkedList;
import java.util.List;

public class SubjectDTO {
    private long id;

    private String naming;

    private List<TeacherSubjectDTO> teacherSubjectDTOS;

    public SubjectDTO() {
        teacherSubjectDTOS = new LinkedList<>();
    }

    public String getNaming() {
        return naming;
    }

    public void setNaming(String naming) {
        this.naming = naming;
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
