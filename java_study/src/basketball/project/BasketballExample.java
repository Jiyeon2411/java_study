package basketball.project;

import java.util.ArrayList;

public class BasketballExample {

	private static ArrayList<Basketball> playerList = new ArrayList<>();
	
	public static void main(String[] args) {

		Basketball player1 = new Basketball("이지연", 15);
		
		Basketball player2 = new ShootingGuard("성준수", 31);
		
		Basketball player3 = new PointGuard("박병찬", 21);
		
		Basketball player4 = new SmallForward("전영중", 4);
		
		playerList.add(player1);
		playerList.add(player2);
		playerList.add(player3);
		playerList.add(player4);
		
		for(Basketball basketball : playerList) {
			System.out.println(basketball.PlayerInfo());
		}
		
		//showAllPlayer();
		
		//모든 선수정보 출력
		/*public static void showAllPlayer() {
			System.out.println("============선수 목록==============");
			
			for(Basketball basketball : playerList) {
				System.out.println(basketball.PlayerInfo());
			}
		}*/
		
		//등번호로 선수정보 출력
	}

}
