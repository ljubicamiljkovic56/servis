package studentski.servis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import studentski.servis.model.Exam;

public interface ExamRepository extends JpaRepository<Exam, Long> {

}
