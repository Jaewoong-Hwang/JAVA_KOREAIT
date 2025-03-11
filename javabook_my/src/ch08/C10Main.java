package ch08;
//홍길동이       					사과장수에게     사과를 구매한다

//구매자	      					판매자			
//보유금액(속성)  					보유금액(속성)
//사과개수(속성)  					사과개수(속성)
//개당가격(속성)

//구매하기(기능)					판매하기(기능)
//1)특정 사과장수에게 돈을 건낸다
//(내 보유금악에서는 차감
//2)돈을 내보유금액에 누적
//								3)사과개수 계산->나의보유 사과 개수에서 차감 ->사과개수 전달
//4나의 보유 사과 개수에 누적


//한정자를 다르게 낼 수도 있음 protect , private public, 상위 클래스를 추가할 수도..


class Buyer {
	private int myMoney;
	private int appleCnt;

	public Buyer(int myMoney, int appleCnt) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
	}

	@Override
	public String toString() {
		return "Buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
	}
	
	public void payment(Seller seller, int money) {
		//내 보유금엑 에서 차감
		//seller에 money를 전달하고 리턴되는 사과 개수를 누적
		this.myMoney=money;
		int appleCnt=seller.receive(money);
		this.appleCnt+=appleCnt;
		
		
	}

}

class Seller {
	private int myMoney;
	private int appleCnt;
	private int price;

	public Seller(int myMoney, int appleCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Seller [myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
	}
	public int receive (int money) {
		//구매자로부터 전달받은 money를 내보유금액에 누적
		// 전달받은 금액 / 사과개수를 리턴
		this.myMoney=money;
		int cnt = money / this.price;
		this.appleCnt=cnt;
		return cnt;
	}

}

public class C10Main {
	public static void main(String[] args) {
		Seller seller = new Seller(10000,100,1000);
		
		Buyer 홍길동 = new Buyer(10000,0);
		Buyer 노홍철 = new Buyer(5000,0);
		
		홍길동.payment(seller, 5000);
		노홍철.payment(seller, 2000);
		
		System.out.println(홍길동); System.out.println("------------");
		System.out.println(노홍철); System.out.println("------------");
		System.out.println(seller);
	}
}
