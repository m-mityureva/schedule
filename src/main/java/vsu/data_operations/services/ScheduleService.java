package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vsu.data_operations.converters.ScheduleConverter;
import vsu.data_operations.dto.ScheduleDTO;
import vsu.data_operations.repositories.ScheduleRepository;

@Service
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }


    @Transactional
    public ScheduleDTO add(ScheduleDTO cd){
        return ScheduleConverter.Entity_To_DTO(scheduleRepository.save(ScheduleConverter.DTO_to_Entity(cd)));
    }
}
