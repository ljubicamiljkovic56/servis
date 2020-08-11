package studentski.servis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import studentski.servis.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	Student findOneByCardNumber(String cardNumber);
    List<Student> findAllByLastName(String lastName);

}
