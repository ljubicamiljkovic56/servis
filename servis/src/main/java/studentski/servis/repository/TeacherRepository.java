package studentski.servis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import studentski.servis.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
