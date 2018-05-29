package vsu.data_operations.dto;

public class StudentDTO {
    private long id;

    private String mail;

    private StudentGroupDTO group;

    private StudentGroupDTO group_praetorian;

    public StudentDTO(){}

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

    public StudentGroupDTO getGroup() {
        return group;
    }

    public void setGroup(StudentGroupDTO group) {
        this.group = group;
    }

    public StudentGroupDTO getGroup_praetorian() {
        return group_praetorian;
    }

    public void setGroup_praetorian(StudentGroupDTO group_praetorian) {
        this.group_praetorian = group_praetorian;
    }
}
