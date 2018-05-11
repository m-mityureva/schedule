package vsu.data_operations.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.data_operations.entities.Classroom;

@Repository
public interface ClassroomRepository extends CrudRepository<Classroom, Long> {
}
