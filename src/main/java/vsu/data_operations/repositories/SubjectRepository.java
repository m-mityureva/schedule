package vsu.data_operations.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.data_operations.entities.Subject;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long> {
}
