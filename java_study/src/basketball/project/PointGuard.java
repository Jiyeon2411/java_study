package basketball.project;

public class PointGuard extends Basketball {
	int shoottry;
	int shootsuccess;
	
	public PointGuard(String name, int number) {
		super(name, number);
		super.score = 40;
		
		super.shoottry = 10;
		super.shootsuccess = 5;
	}

	@Override
	public double shootRatio(int shoottry, int shootsuccess) {
		return shootRatio = (shootsuccess / shoottry) * 100;
	}
	
	
}
