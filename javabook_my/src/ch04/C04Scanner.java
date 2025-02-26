package ch04;

import java.util.Scanner;

public class C04Scanner {

	public static void main(String[] args) {
		// 이름을 입력하세요? 홍길동
		// 홍길동 님의 나이를 입력하세요? 35
		// 홍길동 님의 주소를 입력하세요? 대구광역시 달서구 000
		// 홍길동 님의 나이는 35세 주소는 대구광역시 ~~ 입니다

		Scanner sc= new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String str1=sc.next();
		
		System.out.printf("%s 님의 나이를 입력하세요 :", str1);
		int num1 = sc.nextInt();
		
		sc.nextLine();			//nextLine()이 나오기 전에 써야함

		System.out.printf("%s 님의 주소를 입력하세요: ", str1);
		String str2=sc.nextLine();
				
		
		System.out.printf("%s 님의 나이는  %d 주소는 %s 입니다", str1, num1, str2 );
		
		sc.close();

		
		

		

		
		

	}

}
