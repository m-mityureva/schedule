package vsu.data_operations.converters;

import vsu.data_operations.dto.RequestDTO;
import vsu.data_operations.entities.Request;

public class RequestConverter {
    public static Request DTO_to_Entity(RequestDTO requestDTO){
        if(requestDTO == null)
            return null;
        Request request = new Request();

        request.setApproved(requestDTO.getApproved());
        request.setComment(requestDTO.getComment());
        request.setGroup(GroupConverter.DTO_to_Entity(requestDTO.getGroup()));
        request.setId(requestDTO.getId());
        request.setSchedule(ScheduleConverter.DTO_to_Entity(requestDTO.getSchedule()));
        request.setTimeplace(TimePlaceConverter.DTO_to_Entity(requestDTO.getTime_place()));

        return request;
    }
    public static RequestDTO Entity_to_DTO(Request request){
        if(request == null)
            return null;
        RequestDTO requestDTO = new RequestDTO();

        requestDTO.setApproved(request.getApproved());
        requestDTO.setComment(request.getComment());
        requestDTO.setGroup(GroupConverter.Entity_to_DTO(request.getGroup()));
        requestDTO.setId(request.getId());
        requestDTO.setSchedule(ScheduleConverter.Entity_To_DTO(request.getSchedule()));
        requestDTO.setTime_place(TimePlaceConverter.Entity_To_DTO(request.getTimeplace()));

        return requestDTO;
    }
}
