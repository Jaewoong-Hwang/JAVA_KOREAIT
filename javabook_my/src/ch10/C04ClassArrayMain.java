package ch10;


class C04Person{
	String name;
	int age;
	public C04Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public C04Person() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "C04Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class C04ClassArrayMain {

	public static void main(String[] args) {
	

	}

}
