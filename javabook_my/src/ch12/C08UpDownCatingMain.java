package ch12;

class C08Super {
	void func1() {System.out.println("C08.Super.func1() Call!");}
	void func2() {System.out.println("C08.Super.func2() Call!!!");};
}
class C08Sub extends C08Super {
	void func2() {System.out.println("C08.Super.func2() Call!");}
	
}

public class C08UpDownCatingMain {

	public static void main(String[] args) {
		
		C08Super ob1 = new C08Super();
		ob1.func1();
		
		System.out.println("----------------");
		C08Sub ob2 = new C08Sub();
		ob2.func1();
		ob2.func2();
		
		System.out.println("----------------");
		C08Super ob3 = new C08Sub();
		ob3.func1();
		ob3.func2();	//재정의된 func2 
		
		//Upcasting
		//확장된(멤버추가) 멤버변수 접근 가능하다?  X DownCasting = > 접근
		//확장된(멤버추가) 멤버함수 접근 가능하다?  X DownCasting = > 접근 
		//재정의된 메서드 접근 가능? O X
	}

}
