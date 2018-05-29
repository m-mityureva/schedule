package vsu.data_operations.dto;

import java.util.LinkedList;
import java.util.List;

public class TeacherSubjectDTO {
    private long id;

    private TeacherDTO teacher;

    private SubjectDTO subject;

    private ClassroomDTO classroom;

    private TimePlaceDTO time_place;

    private List<ScheduleDTO> scheduleDTOS;

    public TeacherSubjectDTO() {
        scheduleDTOS = new LinkedList<>();
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

    public TimePlaceDTO getTime_place() {
        return time_place;
    }

    public void setTime_place(TimePlaceDTO time_place) {
        this.time_place = time_place;
    }

    public List<ScheduleDTO> getSchedules() {
        return scheduleDTOS;
    }

    public void setSchedules(List<ScheduleDTO> schedules) {
        this.scheduleDTOS = schedules;
    }
}
