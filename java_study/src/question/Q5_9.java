package question;

public class Q5_9 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
			int sum = 0;
			float avg = 0;
			int count = 0;
			
		for (int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
	}
		
		avg = sum / (float)count;
		
		System.out.println("합: " + sum);
		System.out.println("평균: " + avg);
} 
}