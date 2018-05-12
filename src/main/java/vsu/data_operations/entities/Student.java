package vsu.data_operations.entities;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Mail")
    private String mail;

    @ManyToOne(fetch = FetchType.LAZY)  // по дефолту optional = true
    @JoinColumn(name = "ID_StudentGroup")
    private StudentGroup studentGroup;

    @OneToOne(mappedBy = "praetor")
    private StudentGroup group_praetorian;

    public Student() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudentGroup getGroup_praetorian() {
        return group_praetorian;
    }

    public void setGroup_praetorian(StudentGroup group_praetorian) {
        this.group_praetorian = group_praetorian;
    }
}
