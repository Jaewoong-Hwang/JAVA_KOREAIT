package ch16;

class Animal {
	String name;

}

class Panda extends Animal {

	public Panda(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Panda [name=" + name + "]";
	}

}

class Tiger extends Animal {

	public Tiger(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tiger [name=" + name + "]";
	}

}

public class C04GenericMain {

	// Generic
	public static <T> void PrintByGeneric(T[] arr) {
		for (T el : arr) {
			System.out.println(el);

		}

	}

	public static void main(String[] args) {

		Tiger arr1[] = { new Tiger("시베리안 호랑이"), new Tiger("신사동호랭이"), new Tiger("86호랑이띠") };
		PrintByGeneric(arr1);
		Panda arr2[] = { new Panda("푸바오"), new Panda("래선팬더"), new Panda("쿵푸팬") };
		PrintByGeneric(arr2);

	}
}
