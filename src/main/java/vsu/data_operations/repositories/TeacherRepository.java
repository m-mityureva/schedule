package vsu.data_operations.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.data_operations.entities.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Long> {
}
