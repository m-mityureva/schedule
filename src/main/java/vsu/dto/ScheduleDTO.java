package vsu.dto;

public class ScheduleDTO {
    private long id;

    private GroupDTO group;

    private TeacherSubjectDTO teacher_subject;

    public ScheduleDTO() {
    }

    public TeacherSubjectDTO getTeacher_subject() {
        return teacher_subject;
    }

    public void setTeacher_subject(TeacherSubjectDTO teacher_subject) {
        this.teacher_subject = teacher_subject;
    }

    public GroupDTO getGroup() {
        return group;
    }

    public void setGroup(GroupDTO group) {
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
