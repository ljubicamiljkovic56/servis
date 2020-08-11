package studentski.servis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import studentski.servis.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
