package vsu.dto;

import java.time.LocalDate;

public class TimeplaceDTO {
    private long id;

    private LocalDate time_day;

    private int time_number;

    private String day_of_week;

    private boolean odd;

    public TimeplaceDTO() {}

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
}
