package ch19.sec04;

import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.io.IOException;
import java.net.DatagramPacket;

public class NewsServer {
	private static DatagramSocket datagramSocket = null;
	
	public static void main(String[] args) {
		System.out.println("-----------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요.");
		System.out.println("-----------------------------");
	}

	public static void startServer() {
		Thread thread = new Thread() {

			@Override
			public void run() {
				try {
					//소켓 생성, 50001번 포트 오픈
					datagramSocket = new DatagramSocket(50001);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						//클라이언트한테 데이터를 받는다(뉴스 주제)
						DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
						datagramSocket.receive(receivePacket);
						String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
						
						//클라이언트의 ip와 포트 번호 얻기
						SocketAddress socketAddress = receivePacket.getSocketAddress();
						
						for(int i=1; i<=10; i++) {
							String data = newsKind + ": 뉴스" + i;
							
							//클라이언트한테 데이터를 보낸다.
							byte[] bytes = data.getBytes("UTF-8"); //인코딩
							DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress);
							datagramSocket.send(sendPacket);
						}
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		};
		thread.start();
	}
	public static void stopServer() {
		datagramSocket.close();
		System.out.println("[서버] 종료됨");
	}
	
	
}
