package studentski.servis.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Table(name = "course")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "id")
	private Long id;
	
	//@Column(name = "course_name")
	String name;
	
	@OneToMany(mappedBy = "course", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Enrollment> enrollments = new HashSet<Enrollment>();
	
	@OneToMany(mappedBy = "course", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Exam> exams = new HashSet<Exam>();
		
	@ManyToMany
    @JoinTable(name = "teaching",
               joinColumns = @JoinColumn(name="course_id", referencedColumnName="id"),
               inverseJoinColumns = @JoinColumn(name="teacher_id", referencedColumnName="id"))
	private Set<Teacher> teachers = new HashSet<Teacher>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Enrollment> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(Set<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}
	
	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	public Set<Exam> getExams() {
		return exams;
	}

	public void setExams(Set<Exam> exams) {
		this.exams = exams;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Course c = (Course) o;
        if(c.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, c.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	

}
