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
		
		showAllPlayer();
		
		Basketball basketball = findPlayer(15);
		
		//등번호로 선수정보 출력
		if (basketball == null) {
			System.out.println(" ");
			System.out.println("존재하지 않는 선수입니다.");
		} else {			
			playerScore(basketball, 0); 
			}
	}

	private static Basketball findPlayer(int number) {
		Basketball basketballPlayer = null;
		for( Basketball basketball : playerList){
			if (basketball.getNumber() == number) {
				basketballPlayer = basketball;
				break;
			}
		}
		
		return basketballPlayer;
	}

	//모든 선수정보 출력
	private static void showAllPlayer() {
		System.out.println("============선수 목록==============");
		
		for(Basketball basketball : playerList) {
			System.out.println(basketball.PlayerInfo());
		}
		
	}
		
	public static void playerScore(Basketball basketball, int shootRatio) {
		double shootRatio2 = basketball.shootRatio(10, 5);
		System.out.println("======해당 선수의 득점율=======");
		System.out.println(basketball.getName() +" 선수의 득점율: " + shootRatio2 + "%");
		}
	
}
