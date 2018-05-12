package vsu.data_operations.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vsu.data_operations.entities.StudentGroup;

@Repository
public interface StudentGroupRepository extends CrudRepository<StudentGroup, Long> {
    @Query("select distinct g.course from StudentGroup g order by g.course")
    Iterable<Integer> getAllCourses();

    @Query("select distinct g.number from StudentGroup g where g.course = course order by g.number")
    Iterable<Integer> getAllCourseGroups(int course);

    @Override
    @Transactional
    StudentGroup save(StudentGroup gr);

    @Override
    @Transactional
    Iterable<StudentGroup> findAll();
}
