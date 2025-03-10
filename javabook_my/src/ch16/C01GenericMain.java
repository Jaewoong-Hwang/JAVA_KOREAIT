package ch16;


class 호빵재료{
	
}


class 민트초코 {

	@Override
	public String toString() {
		return "민트초코";
	}

}

class 야채 extends 호빵재료 {

	@Override
	public String toString() {
		return "야채";
	}

}

class 슈크림 extends 호빵재료 {

	@Override
	public String toString() {
		return "슈크림";
	}

}

class 팥 extends 호빵재료 {

	@Override
	public String toString() {
		return "단팥";
	}

}

class 호빵<T extends 호빵재료> {  // 호빵에 들어갈 재료를 선별하기 상위 클래스를 만들고 extends
	private T meterial;

	호빵(T meterial) {
		this.meterial = meterial;
	}

	// toString 재정의
	@Override
	public String toString() {
		return "호빵 [meterial=" + meterial + "]";
	}

}

public class C01GenericMain {
	public static void main(String[] args) {

		호빵<팥> ob1 = new 호빵<팥>(new 팥()); // <>다이아몬드 연산자
		System.out.println(ob1);

		호빵<슈크림> ob2 = new 호빵<슈크림>(new 슈크림());
		System.out.println(ob2);

		호빵<야채> ob3 = new 호빵<야채>(new 야채());
		System.out.println(ob3);
		
//		호빵<민트초코> ob4 = new 호빵<민트초코>(new 민트초코()); 상위 클래스에 속하지 않아서 컴파일 에러
//		System.out.println(ob4);

	}
}
