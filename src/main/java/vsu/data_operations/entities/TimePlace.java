package vsu.data_operations.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "TimePlace")
public class TimePlace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Time_Number")
    private int time_number;

    @Column(name = "Time_Day")
    private LocalDate time_day;

    @Column(name = "Day_OfWeek")
    private String day_of_week;

    @Column(name = "Odd")
    private Boolean odd;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "timeplace", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Request> requests;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "timeplace", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TeacherSubject> teacherSubjects;

    public TimePlace() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public List<TeacherSubject> getTeacherSubjects() {
        return teacherSubjects;
    }

    public void setTeacherSubjects(List<TeacherSubject> teacherSubjects) {
        this.teacherSubjects = teacherSubjects;
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

    public Boolean getOdd() {
        return odd;
    }

    public void setOdd(Boolean odd) {
        this.odd = odd;
    }

    public LocalDate getTime_day() {
        return time_day;
    }

    public void setTime_day(LocalDate time_day) {
        this.time_day = time_day;
    }
}
