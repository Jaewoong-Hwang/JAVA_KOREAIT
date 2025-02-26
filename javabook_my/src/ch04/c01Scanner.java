package ch04;

import java.util.Scanner;     // import

public class c01Scanner {

	public static void main(String[] args) {
		
		//자동 import : ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		
		
		//스트림
		//표준입력 스트림
		//표준출력 스트림
		//코드 해석
		System.out.printf("num1 입력: " );
		int num1 = sc.nextInt(); //엔터(\n), 스페이스바
		System.out.printf("num2 입력: ");
		
		int num2 =sc.nextInt();
		System.out.printf("num3 입력: " );
		
		int num3 =sc.nextInt();
		System.out.printf("num4 입력: " );
		
		int num4 = sc.nextInt();
		
		int sum = num1 + num2 + num3 + num4;
		System.out.printf("%d + %d + %d + %d = %d \n", num1, num2, num3, num4, sum );
		sc.close();
		
		
		
	}

}
