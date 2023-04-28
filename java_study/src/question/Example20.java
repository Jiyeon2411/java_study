package question;

public class Example20 {

	public static boolean main(String[] args) {
		
		boolean isNumber(String str) {
			if(str == null || str == "") {
				return false;
		}
			String str = "123";
			System.out.println(str + "는 숫자입니까? " + isNumber(str));
			str = "1234o";
			System.out.println(str + "는 숫자입니까? " + isNumber(str));
		}

	}

}
