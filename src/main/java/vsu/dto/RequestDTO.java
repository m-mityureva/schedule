package vsu.dto;

public class RequestDTO {
    private long id;

    private GroupDTO group;

    private ScheduleDTO schedule;

    private TimeplaceDTO time_place;

    private Boolean approved;

    private String comment;

    public RequestDTO() {
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public TimeplaceDTO getTime_place() {
        return time_place;
    }

    public void setTime_place(TimeplaceDTO time_place) {
        this.time_place = time_place;
    }

    public ScheduleDTO getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduleDTO schedule) {
        this.schedule = schedule;
    }

    public GroupDTO getGroup() {
        return group;
    }

    public void setGroup(GroupDTO group) {
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
