package basketball.project;

public class ShootingGuard extends Basketball {
	int shoottry;
	int shootsuccess;
	
	public ShootingGuard(String name, int number) {
		super(name, number);
		super.score = 50;
		super.position = "ShootingGuard";
		super.shoottry = 10;
		super.shootsuccess = 7;
	}

	@Override
	public double shootRatio(int shoottry, int shootsuccess) {
		return shootRatio = (shoottry / shootsuccess) * 100;
	}
}
