package vsu.data_operations.converters;

import vsu.data_operations.dto.RequestDTO;
import vsu.data_operations.dto.TeacherSubjectDTO;
import vsu.data_operations.dto.TimePlaceDTO;
import vsu.data_operations.entities.Request;
import vsu.data_operations.entities.Teacher_Subject;
import vsu.data_operations.entities.TimePlace;

import java.util.LinkedList;
import java.util.List;

public class TimePlaceConverter {
    public static TimePlace DTO_to_Entity(TimePlaceDTO timePlaceDTO){
        if(timePlaceDTO == null)
            return null;
        TimePlace timePlace = new TimePlace();

        timePlace.setDay_of_week(timePlaceDTO.getDay_of_week());
        timePlace.setId(timePlaceDTO.getId());
        timePlace.setOdd(timePlaceDTO.isOdd());
        timePlace.setTime_day(timePlaceDTO.getTime_day());
        timePlace.setTime_number(timePlaceDTO.getTime_number());

        List<Request> requests = new LinkedList<>();
        List<RequestDTO> requestDTOS = timePlaceDTO.getRequestDTOS();
        for(RequestDTO r : requestDTOS){
            requests.add(RequestConverter.DTO_to_Entity(r));
        }
        timePlace.setRequests(requests);

        List<Teacher_Subject> teacher_subjects = new LinkedList<>();
        List<TeacherSubjectDTO> teacherSubjectDTOS = timePlaceDTO.getTeacherSubjectDTOS();
        for(TeacherSubjectDTO t : teacherSubjectDTOS){
            teacher_subjects.add(TeacherSubjectConverter.DTO_to_Entity(t));
        }
        timePlace.setTeacher_subjects(teacher_subjects);

        return timePlace;
    }

    public static TimePlaceDTO Entity_To_DTO(TimePlace timePlace){
        if(timePlace == null)
            return null;
        TimePlaceDTO timePlaceDTO = new TimePlaceDTO();

        timePlaceDTO.setDay_of_week(timePlace.getDay_of_week());
        timePlaceDTO.setId(timePlace.getId());
        timePlaceDTO.setOdd(timePlace.getOdd());
        timePlaceDTO.setTime_day(timePlace.getTime_day());
        timePlaceDTO.setTime_number(timePlace.getTime_number());

        List<Request> requests = timePlace.getRequests();
        List<RequestDTO> requestDTOS = new LinkedList<>();
        for(Request r : requests){
            requestDTOS.add(RequestConverter.Entity_to_DTO(r));
        }
        timePlaceDTO.setRequestDTOS(requestDTOS);

        List<Teacher_Subject> teacher_subjects = timePlace.getTeacher_subjects();
        List<TeacherSubjectDTO> teacherSubjectDTOS = new LinkedList<>();
        for(Teacher_Subject t : teacher_subjects){
            teacherSubjectDTOS.add(TeacherSubjectConverter.Entity_To_DTO(t));
        }
        timePlaceDTO.setTeacherSubjectDTOS(teacherSubjectDTOS);

        return timePlaceDTO;
    }
}
