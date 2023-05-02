package basketball.project;

public class PointGuard extends Basketball {
	int twoshoot;
	
	public PointGuard(String name, int number) {
		super(name, number);
		super.score = 30;
		super.shootRatio = 60;
	}

	@Override
	public double shootRatio(int shoottry, int shootsuccess) {
		return shootRatio = (shoottry / shootsuccess) / 100;
	}
	
	
}
