package customer.project;

public class VIPCustomerOther extends Customer {
	double saleRatio; //할인율
	private int agentID; //상담원 아이디
	
	public VIPCustomerOther(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		
		super.customerGrade = "VIP";
		super.bonusRatio = 0.03;
		
		this.saleRatio = 0.2;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		//1. 보너스 포인트 쌓인다.
		bonusPoint += (price * bonusRatio);
				
		//2. 사용자가 지불할 가격을 리턴
		return price; //일반(실버)고객은 할인이 없으므로 지불한 값을 리턴해준다.
	}
	
	//담당 상담원의 정보 출력
	@Override
	public String showCustomerInfo() {
		//고객이름, 등급, 현재 보너스 포인트점수, 상담원ID
		return super.showCustomerInfo() + ", 담당 상담원 아이디: " + agentID;	
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	
	
}
