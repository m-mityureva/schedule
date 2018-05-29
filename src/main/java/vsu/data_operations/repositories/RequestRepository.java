package vsu.data_operations.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.data_operations.entities.Request;

@Repository
public interface RequestRepository extends CrudRepository<Request, Long> {
}
