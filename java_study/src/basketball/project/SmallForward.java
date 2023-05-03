package basketball.project;

public class SmallForward extends Basketball {
	int shoottry;
	int shootsuccess;
	
	public SmallForward(String name, int number) {
		super(name, number);
		super.score = 60;
		super.position = "SmallForward";
		super.shoottry = 10;
		super.shootsuccess = 9;
	}

	@Override
	public double shootRatio(int shoottry, int shootsuccess) {
		return shootRatio = (shoottry / shootsuccess) * 100;
	}
}
