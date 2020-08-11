package studentski.servis.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
//@Table(name = "exam")
public class Exam {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "exam_id")
	private Long id;
	
	//@Column(name = "exam_points")
    private Integer examPoints;
    
	//@Column(name = "lab_points")
    private Integer labPoints;
    
	//@Column(name = "exam_date")
    private Date date;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	private Course course;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	private Student student;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	private ExamPeriod examPeriod;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getExamPoints() {
		return examPoints;
	}

	public void setExamPoints(Integer examPoints) {
		this.examPoints = examPoints;
	}

	public Integer getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(Integer labPoints) {
		this.labPoints = labPoints;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public ExamPeriod getExamPeriod() {
		return examPeriod;
	}

	public void setExamPeriod(ExamPeriod examPeriod) {
		this.examPeriod = examPeriod;
	}
}
