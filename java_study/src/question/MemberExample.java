package question;

public class MemberExample {

	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong");
		
		System.out.println(user1.name);
		System.out.println(user1.id);
		System.out.println(user1.password);
		System.out.println(user1.age);
	}

}
