package ch08;

//멤버변수			:  클래스 내부에서 - 메서드영역 바깥에서 생성

//				   생성된 객체의 개별 정보 저장
//static 변수		:  동일 클래스로부터 만든 여려객체간 공유하는 멤버변수

//지역변수			:  매서드 영역내에서 
//				   (or 매서드 영역내의 {}범위에서)
//				   생성되는 변수
//				   (파라미터,일반변수)

class C05Simple {
	int num = 10; // 멤버변수

	void Func1() { 
		System.out.println("멤버변수 num : " + num);
		int num = 5;
		System.out.println("Func1's 지역변수 num : " + num); // 안에서 정의한 새로운 num
		num++;
		this.num++; // this. 을 쓰게되면 멤버변수에 접근하게 됨. 넓이의 의미에서는 멤버변수 > 지역변수
		// 지역변수는 중괄호 이후 소멸됨 //멤버 변수는 객체가 유지하는 동안에 유지됨
	}

	void Func2() {
		System.out.println("멤버변수 num : " + num); // 멤버 변수가 사용되고 있음
		if (true) {
			int num = 100;
			System.out.println("Func2's if 안 지역변수 num : " + num);
		}
		System.out.println("멤버변수 num : " + num);
		
		while(num<15) {		//멤버변수 num
			int num=7;	//지역변수 num
			System.out.println("지역변수 num : " + num);
			num++;
			
		}
		
		
	}
	void Func3(int num) {   //지역변수 num
		this.num = num; 
	}
}

public class C05LocalVarMain {

	public static void main(String[] args) {

		C05Simple obj = new C05Simple();
		obj.Func1();

	}

}
