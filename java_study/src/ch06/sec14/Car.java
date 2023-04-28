package ch06.sec14;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isStop() { //리턴타입이 boolean인 것은 isStop
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
}
