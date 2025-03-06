package ch11;

class C02Simple {
	static int n1;
	int n2;

	void func1() {
		n1=100;
		n2=200;
	}

	static void func2() {
		n1=100;		//static은 객체와 무관하게 먼저 만들어진다. 그래서 오류 x
		n2=200;		//아직 객체가 형성이 안 된 곳(n2)에 넣으려고 해서 오류가 난다.
					//static 함수에서 사용되는 변수는, static 변수 or 지역변수 선언 이후 사용가능
					//일반멤버변수로의 접근 불가능
		
	}
}

public class C02StaticMain {

	public static void main(String[] args) {
		
	
	}
}
