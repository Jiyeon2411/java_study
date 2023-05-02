package ch07.sec10.exam02;

public class AbstractMethodExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	//메소드 매개변수를 이용한 다형성 구현
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
