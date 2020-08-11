package studentski.servis.web.dto;

import studentski.servis.model.Course;

public class CourseDTO {
	
	private Long id;
	
	private String name;
	
	public CourseDTO() {
		
	}
	
	public CourseDTO(Course course) {
		this(course.getId(), course.getName());
	}
	
	public CourseDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}