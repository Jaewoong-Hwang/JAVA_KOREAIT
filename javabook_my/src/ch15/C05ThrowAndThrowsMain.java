package ch15;

class A {

	public void Ex1() throws NullPointerException { // throws 1인칭 예외를 던짐

		System.out.println("Ex1 process..1");
		throw new NullPointerException("Ex1 Null Exception");

	}
}

class B {
	public void Ex2() throws NullPointerException { // throws 1인칭 예외를 던짐

		System.out.println("Ex2 process..1");
		throw new NullPointerException("Ex2 Null Exception");

	}
}

// throw는 예외를 생성 // throws는 예외를 던질 때
public class C05ThrowAndThrowsMain {

	public static void main(String[] args) {
		System.out.println("실행코드1");
		System.out.println("실행코드2");
		A a = new A();
		B b = new B();
		try { // throws 로 던진 예외를 여기서 직접 잡아야 함! 안 그러면 오류 발생
			a.Ex1();
			b.Ex2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("실행코드3");
	}

}
