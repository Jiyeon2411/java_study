package question;

public class Q5_8 {

	public static void main(String[] args) {
		/* int[] array = {1, 5, 3, 8, 2};
		
		int max = array[0];
		for (int i=0; i<array.length; i++) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		
		System.out.println("최대값: " + max); */
		
		int max = 0;
		int[] arrays = {1, 5, 3, 8, 2};
		
		for(int array : arrays) {
			if(max < array) { //max, array 각각 대입
				max = array;
			}
		}
		
		System.out.println(max);
	} 
}