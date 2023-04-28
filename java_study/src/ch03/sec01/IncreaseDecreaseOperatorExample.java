package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; //11
		++x; //12
		System.out.println("x=" + x);
		System.out.println("-------------------");
		
		y--;
		--y;
		System.out.println("y=" +y);
		System.out.println("-------------------");
		
		z = x++; //일단 12가 먼저 대입되고 연산이 수행되기 때문에 z는 12
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("-------------------");
		
		z = ++x; 
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("-------------------");
		
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("-------------------");
	}

}
