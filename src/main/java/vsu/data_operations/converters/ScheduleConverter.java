package vsu.data_operations.converters;

import vsu.data_operations.dto.RequestDTO;
import vsu.data_operations.dto.ScheduleDTO;
import vsu.data_operations.entities.Request;
import vsu.data_operations.entities.Schedule;

import java.util.LinkedList;
import java.util.List;

public class ScheduleConverter {
    public static Schedule DTO_to_Entity(ScheduleDTO scheduleDTO){
        if(scheduleDTO == null)
            return null;
        Schedule schedule = new Schedule();

        schedule.setGroup(GroupConverter.DTO_to_Entity(scheduleDTO.getGroup()));
        schedule.setId(scheduleDTO.getId());
        schedule.setTeacher_subject(TeacherSubjectConverter.DTO_to_Entity(scheduleDTO.getTeacher_subject()));

        List<Request> requests = new LinkedList<>();
        List<RequestDTO> requestDTOS = scheduleDTO.getRequestDTOS();
        for(RequestDTO r : requestDTOS){
            requests.add(RequestConverter.DTO_to_Entity(r));
        }
        schedule.setRequests(requests);

        return schedule;
    }

    public static ScheduleDTO Entity_To_DTO(Schedule schedule){
        if(schedule == null)
            return null;
        ScheduleDTO scheduleDTO = new ScheduleDTO();

        scheduleDTO.setGroup(GroupConverter.Entity_to_DTO(schedule.getGroup()));
        scheduleDTO.setId(scheduleDTO.getId());
        scheduleDTO.setTeacher_subject(TeacherSubjectConverter.Entity_To_DTO(schedule.getTeacher_subject()));

        List<Request> requests = schedule.getRequests();
        List<RequestDTO> requestDTOS = new LinkedList<>();
        for(Request r : requests){
            requestDTOS.add(RequestConverter.Entity_to_DTO(r));
        }
        scheduleDTO.setRequestDTOS(requestDTOS);

        return scheduleDTO;
    }
}
