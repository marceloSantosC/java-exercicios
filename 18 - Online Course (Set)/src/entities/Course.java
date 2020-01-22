package entities;

import java.util.HashSet;
import java.util.Set;

public class Course {
	private String name;
	private Instructor instructor;
	private Set <User> students = new HashSet<>(); // Set<Log> set = new HashSet<>();
	
	public Course() {
	}
	
	public Course(String name, Instructor instructor) {
		this.name = name;
		this.instructor = instructor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public void setStudent(User student) {
		students.add(student);
	}
	
	public Set<User> getStudent() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return students.size();
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((students == null) ? 0 : students.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		return true;
	}
}
