package vsu.data_operations.dto;

public class StudentDTO {
    private long id;

    private String mail;

    private GroupDTO group;

    private GroupDTO group_praetorian;

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

    public GroupDTO getGroup() {
        return group;
    }

    public void setGroup(GroupDTO group) {
        this.group = group;
    }

    public GroupDTO getGroup_praetorian() {
        return group_praetorian;
    }

    public void setGroup_praetorian(GroupDTO group_praetorian) {
        this.group_praetorian = group_praetorian;
    }
}
