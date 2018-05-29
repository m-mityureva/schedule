package vsu.data_operations.dto;


import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TimePlaceDTO {
    private long id;

    private LocalDate time_day;

    private int time_number;

    private String day_of_week;

    private boolean odd;

    private List<TeacherSubjectDTO> teacherSubjectDTOS;

    private List<RequestDTO> requestDTOS;

    public TimePlaceDTO() {
        teacherSubjectDTOS = new LinkedList<>();
        requestDTOS = new LinkedList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getTime_day() {
        return time_day;
    }

    public void setTime_day(LocalDate time_day) {
        this.time_day = time_day;
    }

    public int getTime_number() {
        return time_number;
    }

    public void setTime_number(int time_number) {
        this.time_number = time_number;
    }

    public String getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(String day_of_week) {
        this.day_of_week = day_of_week;
    }

    public boolean isOdd() {
        return odd;
    }

    public void setOdd(boolean odd) {
        this.odd = odd;
    }

    public List<TeacherSubjectDTO> getTeacherSubjectDTOS() {
        return teacherSubjectDTOS;
    }

    public void setTeacherSubjectDTOS(List<TeacherSubjectDTO> teacherSubjectDTOS) {
        this.teacherSubjectDTOS = teacherSubjectDTOS;
    }

    public List<RequestDTO> getRequestDTOS() {
        return requestDTOS;
    }

    public void setRequestDTOS(List<RequestDTO> requestDTOS) {
        this.requestDTOS = requestDTOS;
    }
}
