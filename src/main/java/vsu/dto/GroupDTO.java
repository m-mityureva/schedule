package vsu.dto;

public class GroupDTO {
    private long id;

    private int number;

    private int course;

    private StudentDTO praetor;

    public GroupDTO() {}

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
}
