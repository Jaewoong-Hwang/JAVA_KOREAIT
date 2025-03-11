package ch16;

class Person {
	String name;
	String age;
	String addr;

	public Person(String name, String age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

}

class Man extends Person {

	public Man(String name, String age, String addr) {
		super(name, age, addr);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Man [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

}

class Woman extends Person {

	public Woman(String name, String age, String addr) {
		super(name, age, addr);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Woman [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

}

class Couple<X, Y> {
	private X member1;
	private Y member2;

	public Couple(X member1, Y member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
	}

	@Override
	public String toString() {
		return "Couple [member1=" + member1 + ", member2=" + member2 + "]";
	}

}

public class C03GenericMain {
	public static void main(String[] args) {

		Couple<Man, Woman> couple1 = new Couple<Man, Woman>(new Man("찰수", "50", "대구"), new Woman("영희", "40", "울산"));
		System.out.println("couple : " + couple1);
		Couple<Man, Man> couple2 = new Couple<Man, Man>(new Man("홍길동1", "30", "대구"), new Man("홍길동2", "25", "인천"));
		System.out.println("couple : " + couple2);

		Couple<Integer, Integer> couple3 = new Couple<Integer, Integer>(100, 30); // 제한을 하지 않았기 때문에 integer 도 가능함 int는																			// 원시자료형이기 때문에 안된다. Integer로 해야함
		System.out.println("couple : " + couple3);

	}
}
