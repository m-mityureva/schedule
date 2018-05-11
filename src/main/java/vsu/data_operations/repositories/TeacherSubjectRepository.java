package vsu.data_operations.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.data_operations.entities.Teacher_Subject;

@Repository
public interface TeacherSubjectRepository extends CrudRepository<Teacher_Subject, Long> {
}
