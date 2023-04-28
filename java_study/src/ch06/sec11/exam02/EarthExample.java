package ch06.sec11.exam02;

public class EarthExample {

	public static void main(String[] args) {
		Earth earth1 = new Earth();
		earth1.personCount = 70;
		System.out.println(earth1.personCount + "억 지구1");
		
		Earth earth2 = new Earth();
		earth2.personCount = 90;
		System.out.println(earth2.personCount + "억 지구2");
		System.out.println(earth1.personCount + "억 지구1");
		
		System.out.println("지구 반지름: " + Earth.EARTH_RADIUS);
		System.out.println("지구 표면적: " + Earth.EARTH_SURFACE_AREA);
	
		//final이므로 바꿀 수 없다.
		Earth.EARTH_RADIUS = 111;
		System.out.println("지구 반지름: " + earth1.EARTH_RADIUS);
		System.out.println("지구 반지름: " + earth2.EARTH_RADIUS);
		//정적은 전역 변수, 한번 값을 주면 공유
		//인스턴스는 지역변수, 그때그때 값을 지정해야됨 각 객체에서만 사용
	}

}
