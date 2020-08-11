package studentski.servis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import studentski.servis.model.ExamPeriod;

public interface ExamPeriodRepository extends JpaRepository<ExamPeriod, Long> {

}
