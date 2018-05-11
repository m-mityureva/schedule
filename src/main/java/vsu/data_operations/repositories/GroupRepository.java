package vsu.data_operations.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vsu.data_operations.entities.Group;

@Repository
public interface GroupRepository extends CrudRepository<Group, Long> {
    @Query("select g.course from Group g order by g.course")
    Iterable<Integer> getAllCourses();

    @Query("select g.number from Group g where g.course = course order by g.number")
    Iterable<Integer> getAllCourseGroups(int course);

    @Override
    @Transactional
    Group save(Group gr);

    @Override
    @Transactional
    Iterable<Group> findAll();
}
