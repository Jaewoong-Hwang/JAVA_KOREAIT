package ch04;

import java.util.Scanner;

public class c03Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("입력된 정수 값 : " + num1);

		//네트워크환경에서의 buffer 란 속도차이를 해결하기 위한 공간, Enter에 대한 이슈가 있음 ==> nextLine 은 버퍼공간에 엔터가 남아 있다고 판단해서 sc.nextLine();을 써야함
		//nextLine만 쓰거나 아니면 혼용해서 쓰려면 꼭 sc.nextLine()을 확인
		
		sc.nextLine(); //버퍼 비우기
		
		System.out.print("문자열 입력(띄어쓰기 포함) : ");
		String str2 = sc.nextLine();				//띄어쓰기도 문자열로. 엔터키로 반환
		System.out.println("문자열 : " + str2);
		
//		System.out.print("실수 입력: ");
//		double num2 = sc.nextDouble();
//		System.out.println("입력된 실수 값 : " + num2);

//		System.out.print("문자열 입력 : ");
//		String str1 = sc.next(); // 문자열 입력받기 기능 함수, 띄어쓰기는 포함하지 않는다.
//		System.out.println("입력된 문자열 : " + str1);
//		


	}

}
