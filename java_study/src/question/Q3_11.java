package question;

public class Q3_11 {

	public static void main(String[] args) {
		byte a = 10;
	       byte b = 20;
	       byte c = (byte) (a + b);

	       char ch = 'A';
	       ch = (char) (ch + 2);

	       float f = 3 / 2.0f; //정수 나누기 정수는 무조건 정수
	       long l = 3000L * 3000L * 3000L;
	       float f2 = 0.1f;

	       double d = 0.1;
	       boolean result = (float)d==f2; //double과 float를 비교시에는 타입을 맞춰줘야 한다.

	       System.out.println("c="+c);
	       System.out.println("ch="+ch);
	       System.out.println("f="+f);
	       System.out.println("l="+l);
	       System.out.println("result="+result);

	}

}
