package java_modeling.ch01.asso3;

public class Course {
	//필드
	private String name;
	//생성자
	public Course(String name) {
		this.name = name;		
	}
	
	public String getName() {
		return name;
	}
	
	public void addTranscript(Transcript transcript) {
		transcript.add(transcript);
	}
	
	
	
	
	
	
	
}
