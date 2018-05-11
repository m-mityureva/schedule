package vsu.data_operations.services;

import org.springframework.stereotype.Service;
import vsu.data_operations.repositories.ScheduleRepository;

@Service
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }
}
