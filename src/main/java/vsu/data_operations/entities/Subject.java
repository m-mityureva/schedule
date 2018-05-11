package vsu.data_operations.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Naming")
    private String naming;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "subject", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Teacher_Subject> teacher_subjects;

    public Subject() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNaming() {
        return naming;
    }

    public void setNaming(String naming) {
        this.naming = naming;
    }

    public List<Teacher_Subject> getTeacher_subjects() {
        return teacher_subjects;
    }

    public void setTeacher_subjects(List<Teacher_Subject> teacher_subjects) {
        this.teacher_subjects = teacher_subjects;
    }
}
