package ch19.sec04;

import java.net.*;

public class NewsClient {

	public static void main(String[] args) {
		try {
			DatagramSocket datagramSocket = new DatagramSocket();
			
			String data = "정치";
			byte[] bytes = data.getBytes("UTF-8");
			
			while(true) {
			
			DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
			datagramSocket.send(receivePacket);
			
			String news = new String(receivePacket.getData(), 0, receivePacket.getLength());
			
			if(news.contains("뉴스10")) {
				break;
			}
			}
			

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
