package vsu.data_operations.converters;

import vsu.data_operations.dto.ScheduleDTO;
import vsu.data_operations.dto.TeacherSubjectDTO;
import vsu.data_operations.entities.Schedule;
import vsu.data_operations.entities.Teacher_Subject;

import java.util.LinkedList;
import java.util.List;

public class TeacherSubjectConverter {
    public static Teacher_Subject DTO_to_Entity(TeacherSubjectDTO teacherSubjectDTO){
        if(teacherSubjectDTO == null)
            return null;
        Teacher_Subject teacher_subject = new Teacher_Subject();

        teacher_subject.setId(teacherSubjectDTO.getId());
        teacher_subject.setClassroom(ClassroomConverter.DTO_to_Entity(teacherSubjectDTO.getClassroom()));
        teacher_subject.setSubject(SubjectConverter.DTO_to_Entity(teacherSubjectDTO.getSubject()));
        teacher_subject.setTeacher(TeacherConverter.DTO_to_Entity(teacherSubjectDTO.getTeacher()));
        teacher_subject.setTimeplace(TimePlaceConverter.DTO_to_Entity(teacherSubjectDTO.getTime_place()));

        List<Schedule> schedules = new LinkedList<>();
        List<ScheduleDTO> scheduleDTOS = teacherSubjectDTO.getSchedules();
        for(ScheduleDTO s : scheduleDTOS){
            schedules.add(ScheduleConverter.DTO_to_Entity(s));
        }
        teacher_subject.setSchedules(schedules);

        return teacher_subject;
    }

    public static TeacherSubjectDTO Entity_To_DTO(Teacher_Subject teacher_subject){
        if(teacher_subject == null)
            return null;
        TeacherSubjectDTO teacherSubjectDTO = new TeacherSubjectDTO();

        teacherSubjectDTO.setId(teacher_subject.getId());
        teacherSubjectDTO.setClassroom(ClassroomConverter.Entity_to_DTO(teacher_subject.getClassroom()));
        teacherSubjectDTO.setSubject(SubjectConverter.Entity_To_DTO(teacher_subject.getSubject()));
        teacherSubjectDTO.setTeacher(TeacherConverter.Entity_To_DTO(teacher_subject.getTeacher()));
        teacherSubjectDTO.setTime_place(TimePlaceConverter.Entity_To_DTO(teacher_subject.getTimeplace()));

        List<Schedule> schedules = teacher_subject.getSchedules();
        List<ScheduleDTO> scheduleDTOS = new LinkedList<>();
        for(Schedule s : schedules){
            scheduleDTOS.add(ScheduleConverter.Entity_To_DTO(s));
        }
        teacherSubjectDTO.setSchedules(scheduleDTOS);

        return teacherSubjectDTO;
    }
}
