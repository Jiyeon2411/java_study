package ch18.sec02.exam02;

import java.io.*;

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test3.db");
			
			byte[] array = {10, 20, 30, 40, 50};
			
			//출력
			os.write(array, 1, 3); //1번 인덱스 번호부터 3개의 데이터를 출력한다.
			
			//버터에 잔류하는 데이터를 비워준다.
			os.flush();
			os.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}

}
