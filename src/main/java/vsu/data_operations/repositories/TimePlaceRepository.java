package vsu.data_operations.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vsu.data_operations.entities.TimePlace;

@Repository
public interface TimePlaceRepository extends CrudRepository<TimePlace, Long> {

}
