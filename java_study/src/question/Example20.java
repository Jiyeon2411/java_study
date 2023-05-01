package question;

public class Example20 {

	public static boolean isNumber(String str) {
		//null이거나 빈문자열 이면 false 변환
		if(str == null || str.equals("")) return false;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i); //배열 자릿수에 있는 글자를ㄱ
			char c2 = 'A'; //65
			System.out.println(ch);
			if(ch < '0' || ch > '9') { //ch가 0~9사이의 숫자가 아니면
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
			String str = "123";
			System.out.println(str + "는 숫자입니까? " + isNumber(str));
			str = "1234o";
			System.out.println(str + "는 숫자입니까? " + isNumber(str));
		}

	}
