package vsu.data_operations.dto;

import java.util.LinkedList;
import java.util.List;

public class ClassroomDTO {
    private long id;

    private String type;

    private int number;

    private boolean available;

    private List<TeacherSubjectDTO> teacherSubjectDTOS;

    public ClassroomDTO() {
        teacherSubjectDTOS = new LinkedList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public List<TeacherSubjectDTO> getTeacherSubjectDTOS() {
        return teacherSubjectDTOS;
    }

    public void setTeacherSubjectDTOS(List<TeacherSubjectDTO> teacherSubjectDTOS) {
        this.teacherSubjectDTOS = teacherSubjectDTOS;
    }
}
