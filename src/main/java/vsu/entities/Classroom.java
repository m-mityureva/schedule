package vsu.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Classroom")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Type")
    private String type;

    @Column(name = "Number")
    private int number;

    @Column(name = "Available")
    private boolean available;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "classroom", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Teacher_Subject> teacher_subjects;

    public Classroom(){}

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

    public List<Teacher_Subject> getTeacher_subjects() {
        return teacher_subjects;
    }

    public void setTeacher_subjects(List<Teacher_Subject> teacher_subjects) {
        this.teacher_subjects = teacher_subjects;
    }
}
