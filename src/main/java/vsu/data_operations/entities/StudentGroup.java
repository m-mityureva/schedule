package vsu.data_operations.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "StudentGroup")
public class StudentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Number")
    private int number;

    @Column(name = "Course")
    private int course;

    @Column(name = "SubNumber")
    private int subnumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Praetor")
    private Student praetor;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "studentGroup", cascade = CascadeType.ALL)  // orphan removal по дефолту false
    private List<Student> students;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "studentGroup", cascade = CascadeType.ALL)  // orphan removal по дефолту false
    private List<Schedule> schedules;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "studentGroup", cascade = CascadeType.ALL)  // orphan removal по дефолту false
    private List<Request> requests;

    public StudentGroup() {}

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getPraetor() {
        return praetor;
    }

    public void setPraetor(Student praetor) {
        this.praetor = praetor;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public int getSubnumber() {
        return subnumber;
    }

    public void setSubnumber(int subnumber) {
        this.subnumber = subnumber;
    }
}
