package goodSchool;

import java.util.ArrayList;

public class Main {

	public static ArrayList<Student> studentList = new ArrayList<>();
	
	public static void main(String[] args) {
		Student jieun = new Student();
		Student seulgi = new Student();
		Student hyunwook = new Student();
		Student jiyeon = new Student();
		Student jaehyun = new Student();
		
		studentList.add(jieun);
		studentList.add(seulgi);
		studentList.add(hyunwook);
		studentList.add(jiyeon);
		studentList.add(jaehyun);
	}

}
