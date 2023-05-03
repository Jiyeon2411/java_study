package basketball.project;

public class Basketball {
	//필드
	String name;
	String position;
	int number;
	int score;
	double shootRatio;
	int shoottry;
	int shootsuccess;
	int twopointshoot;
	
	//생성자
	public Basketball() {
		initBasketball();
	}
	
	public Basketball(String name, int number) {
		this.name = name;
		this.number = number;
		initBasketball();
	}

	public void initBasketball() {
		position = "Center";
		score = 20;
		shoottry = 10;
		shootsuccess = 5;
		twopointshoot = 3;
	}
	
	public double shootRatio(int shoottry, int shootsuccess) {
		shootRatio = (shoottry / shootsuccess) * 100;
		return shootRatio;
		
	}
	
	public String PlayerInfo() {
		return position + " " + name + "의 득점 점수: " + score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
