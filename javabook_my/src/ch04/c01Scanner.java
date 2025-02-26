package ch04;

import java.util.Scanner;     // import

public class c01Scanner {

	public static void main(String[] args) {
		
		//자동 import : ctrl + shift + o
		
		
		
		//스트림

		//System.in : 표준입력 스트림 생성(요청)
		//System.out : 표준출력 스트림
		//Stream: 시냇물, 물줄기(단방향성)
		//데이터의 이동 통로

		//코드 해석
		//new Scanner(System.in) : 표준입력 스트립을 연결한 Scanner객체 생성
		//Scanner sc : 생성된 Scanner객체의 위치정보 (메모리주소)를 저장한 참조변수 sc
		//Scanner sc = new Scanner(System.in);
		// -표준입력스트림에 연결된 Scanner객체를 생성 이후 위치정보를 main Stack영역의 Scanner sc 참조변수에 초기화
		//Scans the next token of the input as an int   ===> 버퍼 공간에서 int 를 스캔

		Scanner sc = new Scanner(System.in);
		
		
		System.out.printf("num1 입력: " );
		int num1 = sc.nextInt(); //엔터(\n), 스페이스바       //스페이스바는 연속적으로 값을 저장 가능, 엔터는 하나씩
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
