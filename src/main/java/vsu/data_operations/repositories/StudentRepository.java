package vsu.data_operations.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.data_operations.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
