package goodSchool;

public class Score {
	
	//필드
	int studentId;
	Subject subject;
	int point;
	
	//생성자
	public void Score(int studentId, Subject subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}
	
	public String toString() {
		return "학번" + studentId + "," + subject.getSubjectName() + ":" + point;
 		
	}
}
