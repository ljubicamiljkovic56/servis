package studentski.servis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import studentski.servis.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

}
