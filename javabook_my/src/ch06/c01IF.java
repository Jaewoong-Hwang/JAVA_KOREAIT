package ch06;

import java.util.Scanner;

public class c01IF {

	public static void main(String[] args) {

		// 단순 IF

		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		if (age >= 8)
//			System.out.println("학교에 다닙니다.");
//		System.out.println("첫 번째 IF 코드 블럭 종료..");
//		if (age < 8)
//			System.out.println("학교에 다니지 않습니다");
//		System.out.println("두 번째 IF 코드 블럭 종료..");
//
//		System.out.println("프로그램을 종료합니다");

		
		
		
		
		
		// 문제
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
		// 3의 배수이면서 5의 배수라면 출력

//		System.out.println("정수 하나를 입력 해주시면, 3의 배수 또는 5의 배수인지 확인시켜 드립니다.");
//		int num = sc.nextInt();
//		if (num % 3 == 0) {
//			System.out.printf("%d 는 3의 배수입니다\n", num);
//			
//			if (num % 5 == 0) {
//				System.out.printf("%d 는 5의 배수입니다\n", num);
//			}
//
//		}else
//			System.out.printf("%d 는 3과 5의 배수가 아닙니다\n", num);
		
		
		
		//문제
		//두 개의 정수를 입력받아 큰 수 출력
//		System.out.println("정수 두 개를 입력 해주시면, 두 수를 비교해서 더 큰 수를 출력해드립니다.");
//		System.out.println("정수 입력 :");
//		int num1 = sc.nextInt();
//		System.out.println("정수 입력 :");
//		int num2 = sc.nextInt();
//		
//		if(num1 > num2) {
//			System.out.printf("%d 가(이) %d 보다 더 큰 수 입니다.", num1, num2);
//			
//		}else if(num1 < num2)
//			System.out.printf("%d 가(이) %d 보다 더 큰 수 입니다.", num2, num1);
//		----------------------------------------------------------------------------
		
		//문제 3	==> 세 개의 수가 나온다면 공식 ===> 하나의 공간을 만들어줘야 함
//		System.out.println("정수 세 개를 입력 해주시면, 두 수를 비교해서 더 큰 수를 출력해드립니다.");
//		System.out.println("정수 입력 :");
//		int num1 = sc.nextInt();
//		System.out.println("정수 입력 :");
//		int num2 = sc.nextInt();
//		System.out.println("정수 입력 :");
//		int num3 = sc.nextInt();
//		
		
//		if(num1 > num2 && num1 > num3) {
//			System.out.printf("%d 가(이) %d 와(과) %d 보다 더 큰 수 입니다.", num1, num2, num3);
//		}else if(num2 > num1 && num2 > num3) {
//			System.out.printf("%d 가(이) %d 와(과) %d 보다 더 큰 수 입니다.", num2, num1, num3);
//		}else if(num3 > num1 && num3 > num2) {
//			System.out.printf("%d 가(이) %d 와(과) %d 보다 더 큰 수 입니다.", num3, num1, num2);
//		}
		
//		----------------------------------------------------------------------------

		//문제4
//		System.out.println("정수 세 개를 입력 해주시면, 총합과 평균(소수점 두 번째 까지)을 출력해드립니다.");
//		System.out.println("정수 입력 :");
//		int num1 = sc.nextInt();
//		System.out.println("정수 입력 :");
//		int num2 = sc.nextInt();
//		System.out.println("정수 입력 :");
//		int num3 = sc.nextInt();
//		
//		
//		int sum = num1 + num2 + num3;
//		double avg = (double)sum / 3;
//		System.out.printf("%d , %d , %d 의 총합은 : %d\n", num1, num2, num3, sum);
//		System.out.printf("%d , %d , %d 의 평균은 : %.2f\n", num1, num2, num3, avg);
		
//		----------------------------------------------------------------------------

		 
		//문제 5
		//입력한 수가 짝수이고, 3의 배수라면 출력
		//입력한 수가 홀수이고, 5의 배수라면 출력
		
		System.out.println("정수 하나를 입력 해주시면, 6의 배수인지 5의 배수인지 확인시켜 드립니다.");
		System.out.println("정수 입력 :");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.printf("%d 는(은) 짝수입니다.", num);
			if(num % 3 ==0) {
				System.out.printf("%d 는(은) 3의 배수입니다.", num);
				if(num % 6 ==0) {
					System.out.printf("%d 는(은) 짝수이면서 3의 배수입니다.", num);
				}
				
			}
		}else if(num % 2 !=0) {
			System.out.printf("%d 는(은) 홀수 입니다.", num);
			if(num % 5 ==0) {
				System.out.printf("%d 는(은) 5의 배수 입니다.", num);
			}
		}
			
		
		
		
		
		sc.close();

	}

}
