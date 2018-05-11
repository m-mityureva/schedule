package vsu.data_operations.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.data_operations.entities.Schedule;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Long> {
}
