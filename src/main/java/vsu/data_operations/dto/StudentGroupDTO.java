package vsu.data_operations.dto;

import vsu.data_operations.entities.Schedule;

import java.util.LinkedList;
import java.util.List;

public class StudentGroupDTO {
    private long id;

    private int number;

    private int subnumber;

    private int course;

    private StudentDTO praetor;

    private List<StudentDTO> studentDTOS;

    private List<RequestDTO> requestDTOS;

    private List<ScheduleDTO> scheduleDTOS;

    public StudentGroupDTO() {
        studentDTOS = new LinkedList<>();
        requestDTOS = new LinkedList<>();
        scheduleDTOS = new LinkedList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public StudentDTO getPraetor() {
        return praetor;
    }

    public void setPraetor(StudentDTO praetor) {
        this.praetor = praetor;
    }

    public List<StudentDTO> getStudentDTOS() {
        return studentDTOS;
    }

    public void setStudentDTOS(List<StudentDTO> studentDTOS) {
        this.studentDTOS = studentDTOS;
    }

    public List<RequestDTO> getRequestDTOS() {
        return requestDTOS;
    }

    public void setRequestDTOS(List<RequestDTO> requestDTOS) {
        this.requestDTOS = requestDTOS;
    }

    public List<ScheduleDTO> getScheduleDTOS() {
        return scheduleDTOS;
    }

    public void setScheduleDTOS(List<ScheduleDTO> scheduleDTOS) {
        this.scheduleDTOS = scheduleDTOS;
    }

    public int getSubnumber() {
        return subnumber;
    }

    public void setSubnumber(int subnumber) {
        this.subnumber = subnumber;
    }
}
