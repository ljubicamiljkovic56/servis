package studentski.servis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studentski.servis.model.Exam;
import studentski.servis.repository.ExamRepository;


@Service
public class ExamService {
	
	@Autowired
	ExamRepository examRepository;
	
	public Exam findOne(Long id) {
		return examRepository.findById(id).orElse(null);
	}

	public List<Exam> findAll() {
		return examRepository.findAll();
	}
	
	public Exam save(Exam exam) {
		return examRepository.save(exam);
	}

	public void remove(Long id) {
		examRepository.deleteById(id);
	}

}
