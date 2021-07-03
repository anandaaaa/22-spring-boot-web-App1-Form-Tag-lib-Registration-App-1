package in.anand.binding;

import java.util.Arrays;

public class StudentBinding {
	
	private String studentName;
	private String email;
	private String phno;
	private String gender;
	private String course;
	private String[] timing;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String[] getTiming() {
		return timing;
	}
	public void setTiming(String[] timing) {
		this.timing = timing;
	}
	@Override
	public String toString() {
		return "StudentBinding [studentName=" + studentName + ", email=" + email + ", phno=" + phno + ", gender="
				+ gender + ", course=" + course + ", timing=" + Arrays.toString(timing) + "]";
	}
	
	
	
	
	

}
