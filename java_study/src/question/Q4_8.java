package question;

public class Q4_8 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.println("*");
				if (j == i) {
					System.out.println();
				}
			}
		} 
	}
}