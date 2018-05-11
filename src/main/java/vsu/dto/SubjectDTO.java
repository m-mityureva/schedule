package vsu.dto;

public class SubjectDTO {
    private long id;

    private String naming;

    public SubjectDTO() {}

    public String getNaming() {
        return naming;
    }

    public void setNaming(String naming) {
        this.naming = naming;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
