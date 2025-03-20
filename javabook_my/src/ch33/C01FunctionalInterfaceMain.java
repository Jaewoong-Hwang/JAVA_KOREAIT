package ch33;

@FunctionalInterface			//함수형인터페이스 선언 컴파일러에게 함수형임을 알림
interface Func1{
	void say(String message);	//추상메서드
//	void say2(String message);	//추상메서드, 함수형 인터페이스는 추상 메서드가 하나여야만 한다.
	
}

public class C01FunctionalInterfaceMain {
	public static void main(String[] args) {
			//01
		Func1 func1 = (message)->{System.out.println(message+"_!");};
		func1.say("HELLOWORLD");
		
		Func1 func1_1 = System.out::println;
		func1_1.say("HELLOWORLD");
	}
}
