package studentski.servis.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
//@Table(name = "examperiod")
public class ExamPeriod {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "examperiod_id")
	private Long id;
	
	//@Column(name = "examperiod_name")
	private String name;
	
	//@Column(name = "start_date")
	private Date startDate;
	
	//@Column(name = "end_date")
	private Date endDate;
	
	@OneToMany(mappedBy = "examPeriod", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Exam> exams = new HashSet<Exam>();

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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
        ExamPeriod e = (ExamPeriod) o;
        if(e.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, e.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

	@Override
	public String toString() {
		return "ExamPeriod [id=" + id + ", name=" + name + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}
}
