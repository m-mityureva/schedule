package vsu.dto;

public class TeacherSubjectDTO {
    private long id;

    private TeacherDTO teacher;

    private SubjectDTO subject;

    private ClassroomDTO classroom;

    private TimeplaceDTO time_place;

    public TeacherSubjectDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TeacherDTO getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherDTO teacher) {
        this.teacher = teacher;
    }

    public SubjectDTO getSubject() {
        return subject;
    }

    public void setSubject(SubjectDTO subject) {
        this.subject = subject;
    }

    public ClassroomDTO getClassroom() {
        return classroom;
    }

    public void setClassroom(ClassroomDTO classroom) {
        this.classroom = classroom;
    }

    public TimeplaceDTO getTime_place() {
        return time_place;
    }

    public void setTime_place(TimeplaceDTO time_place) {
        this.time_place = time_place;
    }
}
