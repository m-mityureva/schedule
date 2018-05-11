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
    @JoinColumn(name = "ID_Group")
    private Group group;

    @OneToOne(mappedBy = "praetor")
    private Group group_praetorian;

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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Group getGroup_praetorian() {
        return group_praetorian;
    }

    public void setGroup_praetorian(Group group_praetorian) {
        this.group_praetorian = group_praetorian;
    }
}
