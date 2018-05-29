package vsu.data_operations.converters;

import vsu.data_operations.dto.StudentGroupDTO;
import vsu.data_operations.dto.RequestDTO;
import vsu.data_operations.dto.ScheduleDTO;
import vsu.data_operations.dto.StudentDTO;
import vsu.data_operations.entities.StudentGroup;
import vsu.data_operations.entities.Request;
import vsu.data_operations.entities.Schedule;
import vsu.data_operations.entities.Student;

import java.util.LinkedList;
import java.util.List;

public class StudentGroupConverter {
    public static StudentGroup DTO_to_Entity(StudentGroupDTO groupDTO){
        if(groupDTO == null)
            return null;

        StudentGroup group = new StudentGroup();

        group.setCourse(groupDTO.getCourse());
        group.setId(groupDTO.getId());
        group.setNumber(groupDTO.getNumber());
        group.setPraetor(StudentConverter.DTO_to_Entity(groupDTO.getPraetor()));
        group.setSubnumber(groupDTO.getSubnumber());

        List<Student> student_entities = new LinkedList<>();
        List<Request> request_entities = new LinkedList<>();
        List<Schedule> schedule_entities = new LinkedList<>();
        List<StudentDTO> studentDTOS = groupDTO.getStudentDTOS();
        List<RequestDTO> requestDTOS = groupDTO.getRequestDTOS();
        List<ScheduleDTO> scheduleDTOS = groupDTO.getScheduleDTOS();

        for (StudentDTO s : studentDTOS) {
            student_entities.add(StudentConverter.DTO_to_Entity(s));
        }
        group.setStudents(student_entities);

        for (RequestDTO r : requestDTOS) {
            request_entities.add(RequestConverter.DTO_to_Entity(r));
        }
        group.setRequests(request_entities);

        for (ScheduleDTO s : scheduleDTOS) {
            schedule_entities.add(ScheduleConverter.DTO_to_Entity(s));
        }
        group.setSchedules(schedule_entities);
        return group;
    }

    public static StudentGroupDTO Entity_to_DTO(StudentGroup group){
        if(group == null)
            return null;
        StudentGroupDTO groupDTO = new StudentGroupDTO();

        groupDTO.setCourse(group.getCourse());
        groupDTO.setId(group.getId());
        groupDTO.setNumber(group.getNumber());
        groupDTO.setPraetor(StudentConverter.Entity_To_DTO(group.getPraetor()));
        groupDTO.setSubnumber(group.getSubnumber());

        List<Student> student_entities = group.getStudents();
        List<Request> request_entities = group.getRequests();
        List<Schedule> schedule_entities = group.getSchedules();
        List<StudentDTO> studentDTOS = new LinkedList<>();
        List<RequestDTO> requestDTOS = new LinkedList<>();
        List<ScheduleDTO> scheduleDTOS = new LinkedList<>();

        for (Student s : student_entities) {
            studentDTOS.add(StudentConverter.Entity_To_DTO(s));
        }
        groupDTO.setStudentDTOS(studentDTOS);

        for (Request r : request_entities) {
            requestDTOS.add(RequestConverter.Entity_to_DTO(r));
        }
        groupDTO.setRequestDTOS(requestDTOS);

        for (Schedule s : schedule_entities) {
            scheduleDTOS.add(ScheduleConverter.Entity_To_DTO(s));
        }
        groupDTO.setScheduleDTOS(scheduleDTOS);

        return groupDTO;
    }
}
