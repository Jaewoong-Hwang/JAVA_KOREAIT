package ch15;

public class C04ExceptionMain {
	public static void main(String[] args) {
		String str = null;
		try {
		str.toString();
		}catch(NullPointerException e) {
			System.out.println("에외발생 : " +e.getMessage());
		}
		int arr[] = {10,20,30,};
		try {
		arr[5] = 100;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		try {
		Integer.parseInt("a1234");
		}catch(NumberFormatException e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		Animal animal = new Dog();
		try {
		Cat yummi = (Cat)animal;
		}catch(ClassCastException e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		fianlly{
			//자원정리 작업
			System.out.println("Finally Test...");
		}
		
		
		System.out.println("HELLOWORLD");
	}
}
