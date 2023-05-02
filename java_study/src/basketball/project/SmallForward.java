package basketball.project;

public class SmallForward extends Basketball {
	int twoshoot;
	int threeshoot;
	
	public SmallForward(String name, int number) {
		super(name, number);
		super.score = 60;
		super.shootRatio = 80;
	}

	@Override
	public double shootRatio(int shoottry, int shootsuccess) {
		return shootRatio = (shoottry / shootsuccess) / 100;
	}
}
