package basketball.project;

public class ShootingGuard extends Basketball {
	int twoshoot;
	int threeshoot;
	
	public ShootingGuard(String name, int number) {
		super(name, number);
		super.score = 50;
		super.shootRatio = 70;
	}

	@Override
	public double shootRatio(int shoottry, int shootsuccess) {
		return shootRatio = (shoottry / shootsuccess) / 100;
	}
}
