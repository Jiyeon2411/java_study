package goodSchool;

import java.util.ArrayList;

public class Subject {
	
	//필드
	String subjectName;
	int subjectId;
	int gradeType;
	public static ArrayList<Student> studentList = new ArrayList<>();

	//생성자
	public void Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
	}
	
	public void register(Student student) {
		studentList.add(student);
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public static ArrayList<Student> getStudentList() {
		return studentList;
	}

	public static void setStudentList(ArrayList<Student> studentList) {
		Subject.studentList = studentList;
	}
	
	
}
