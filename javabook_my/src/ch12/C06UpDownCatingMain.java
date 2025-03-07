package ch12;

class Super{
	int n1;
}
class Sub extends Super{
	int n2;
}

public class C06UpDownCatingMain {
	public static void main(String[] args) {
		Super ob1 = new Super();
		ob1.n1=10;
		Sub ob2 = new Sub();
		ob2.n1=10;
		ob2.n2=20;
		
		//Upcasting(상위클래스 참조변수 = 하위클래스형 객체)(자동형변환)
		//상속관계로 연결된 모든 하위객체를 연결할 수 있다.
		Super ob3 = new Sub(); //upcasting 자동형변환		//Super 가 가리킬 수 있는 범위는 n1 정도이기 때문에 메모리를 침범하지 않아 알아서 형변환이 된다.
		ob3.n1=100;	//상위클래스인 Super의 기능만 사용 가능하다. 
		//ob3.n2=200; // Super의 기능이 아니기 때문에 실행 안됨.
		Super ob4 = ob2; //Upcasting	ob4는 주소. ob2와 같은 주소를 가짐.
		ob4.n1=100;//상위클래스인 Super의 기능만 사용 가능하다.
		//ob4.n2=200;// Super의 기능이 아니기 때문에 실행 안됨.
		
	
		//Upcasting을 쓰는 이유는 상속관계로 엵혀있는 많은 하위 객체들을 연결하기 위함임.
		//연결된 상태에서 확장된 기능을 사용하기 위해 Downcasting
		
		
		//Downcasting(하위클래스 참조변수 = 상위클래형 객체)(강제형변환)
		//Upcasting된 상태에서 확장된 멤버에 접근하기 위한 용도
		//Sub ob5 = (Sub)ob1;	// 	없는 메모리영역을 가리키고 있기 때문에 오류가 생긴다. 컴파일러가 잡지 못하는 오류. 원시타입은 데이터 오류였지만, 이건 런타임 오류이기 떄문에 심각한 오류다.
		Sub ob6 = (Sub)ob3;		//upcasting 된 sub3을 downcasting //n1,n2를 포함한 sub 를 가지고 있는 super. 
								//런타임 에러를 발생시키지 않는다.=>sub가 이미 n2까지 가리키고 있기때문에 메모리 침범 x
		System.out.println(ob6);
		
		
	}
}
