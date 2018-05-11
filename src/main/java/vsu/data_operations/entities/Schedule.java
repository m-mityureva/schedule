package vsu.data_operations.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Group")
    private Group group;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Teacher_Subject")
    private Teacher_Subject teacher_subject;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "schedule",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Request> requests;

    public Schedule() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Teacher_Subject getTeacher_subject() {
        return teacher_subject;
    }

    public void setTeacher_subject(Teacher_Subject teacher_subject) {
        this.teacher_subject = teacher_subject;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }
}
