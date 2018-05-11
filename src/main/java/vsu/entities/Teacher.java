package vsu.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "FullName")
    private String full_name;

    @Column(name = "Mail")
    private String mail;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "teacher", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Teacher_Subject> his_subjects;

    public Teacher() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<Teacher_Subject> getHis_subjects() {
        return his_subjects;
    }

    public void setHis_subjects(List<Teacher_Subject> his_subjects) {
        this.his_subjects = his_subjects;
    }
}
