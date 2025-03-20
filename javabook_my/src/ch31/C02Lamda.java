package ch31;

import java.util.Scanner;

interface Printer{
//	void print(String message);		//추상메서드
//	String print(String message);	//추상메서드
	String print();					//추상메서드
}

public class C02Lamda {
	public static void main(String[] args) {
		//01
//		Printer printer = (message) -> {System.out.println(message);};	//객체를 생성하지 않아도  사용 가능
//		printer.print_1("HELLOWORLD");

		
		//02
//		Printer printer = (message) -> {return message+"HELLOWORLD";};	//람다식 입력 
//		//약식 Printer printer = (message) -> return message+"HELLOWORLD";
//		String returnValue = printer.print("TEST");
//		System.out.println(returnValue); //TEST_HELLOWORLD가 출력
//		
		//03
		
		Printer printer = () -> {
			Scanner sc = new Scanner(System.in);
			System.out.print("입력 : ");
			String str = sc.nextLine();
			sc.close();
			return str;
		};
		String returnValue = printer.print();
		System.out.println(returnValue);
	}
}
