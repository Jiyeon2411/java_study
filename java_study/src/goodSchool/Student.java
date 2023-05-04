package goodSchool;

import java.util.ArrayList;

public class Student {
	
	//필드
	int studentId;
	String studentName;
	Subject majorSubject;
	public static ArrayList<Score> scoreList = new ArrayList<>();

	//생성자
	public void Student(int studentId, String studentName, Subject majorSubject) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}

	public static ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public static void setScoreList(ArrayList<Score> scoreList) {
		Student.scoreList = scoreList;
	}
}
