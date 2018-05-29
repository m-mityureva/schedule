package vsu.data_operations.dto;

import java.util.LinkedList;
import java.util.List;

public class ScheduleDTO {
    private long id;

    private StudentGroupDTO group;

    private TeacherSubjectDTO teacher_subject;

    private List<RequestDTO> requestDTOS;

    public ScheduleDTO() {
        requestDTOS = new LinkedList<>();
    }

    public TeacherSubjectDTO getTeacher_subject() {
        return teacher_subject;
    }

    public void setTeacher_subject(TeacherSubjectDTO teacher_subject) {
        this.teacher_subject = teacher_subject;
    }

    public StudentGroupDTO getGroup() {
        return group;
    }

    public void setGroup(StudentGroupDTO group) {
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<RequestDTO> getRequestDTOS() {
        return requestDTOS;
    }

    public void setRequestDTOS(List<RequestDTO> requestDTOS) {
        this.requestDTOS = requestDTOS;
    }
}
