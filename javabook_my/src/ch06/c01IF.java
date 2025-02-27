package ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		
		//-----------------------
		//단순 IF	
		//-----------------------
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : " );
//		int age = sc.nextInt();
//		if(age >= 8)
//			System.out.println("학교에 다닙니다.");
//		
//		System.out.println("첫번째 IF 코드 블럭 종료..");
//		
//		if(age<8)
//			System.out.println("학교에 다니지 않습니다.");
//		
//		System.out.println("두번째 IF 코드 블럭 종료..");	
//		System.out.println("프로그램을 종료합니다");
//		
//		sc.close();
		
		
		//-----------------------
		//IF-ELSE	
		//-----------------------
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : " );
//		int age = sc.nextInt();
//		
//		if(age >= 8)
//			System.out.println("학교에 다닙니다.");
//		else
//			System.out.println("학교에 다니지 않습니다.");
//
//		System.out.println("프로그램을 종료합니다");
//		
//		sc.close();
		
		//-----------------------
		//1 문제
		//-----------------------
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
		// 3의 배수이면서 5의 배수라면 출력 - 
		// 순서도도 그려보세요 - 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수입력 : " );
//		int num = sc.nextInt();
//		
//		if(num%3==0) {
//			System.out.printf("%d 는 3의 배수입니다\n",num);
//			
//			if(num%5==0) {
//				System.out.printf("%d 는 5의 배수입니다\n",num);
//			}
//		}
//		
//		sc.close();
		
		
		//-----------------------
		//2 문제
		//-----------------------
		// 두개의 정수를 입력받아 큰 수 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("두개 정수 입력 : ");
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		
//		if(n1>=n2) {
//			System.out.println("큰수 : " + n1);
//		}else {
//			System.out.println("큰수 : " + n2);
//		}
//
//		sc.close();
//		
		//-----------------------
		//3 문제(☆)
		//-----------------------
//		// 세 개의 정수를 입력받아 큰 수 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("세 개 정수 입력 : ");
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		
//		int max = n1;	//최대값(max)이 n1이라고 가정 시작 - !
//		
//		if(max<n2){
//			max=n2;
//		}
//		if(max<n3) {
//			max=n3;
//		}
//
//		System.out.println("큰 수 : " + max);
//		sc.close();
		

//		// 세 개의 정수를 입력받아 큰 수 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("세 개 정수 입력 : ");
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//			
//		
//		//n1이 제일 큰경우(n1>n2 && n1>n3) 
//		//n2이 제일 큰경우(n2>n1 && n2>n3)
//		//n3이 제일 큰경우(n3>n1 && n3>n2)
//		if(n1>=n2 && n1>=n3) 
//			System.out.println("큰 수 : " + n1);
//		
//		else if(n2>=n1 && n2>=n3)
//			System.out.println("큰 수 : " + n2);
//		
//		else
//			System.out.println("큰 수 : " + n3);
//	
//
//		sc.close();
		
		
//		//-----------------------
//		//4 문제
//		//-----------------------
//		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("세 개 정수 입력 : ");
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		
//		int sum = n1 + n2 + n3;
//		double avg = (double)sum/3;
//		
//		System.out.println("합 : " + sum + " 평균 : " + avg);
//		
//		sc.close();
		
		//-----------------------
		//5 문제
		//-----------------------
//		입력한 수가 짝수이고, 3의 배수라면 출력 (n%2==0 && n%3==0)
//		입력한 수가 홀수이고, 5의 배수라면 출력 (n%2==1 && n%5==0)
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//01
//		if(n%2==0 && n%3==0)
//			System.out.printf("%d 는 짝수이면서 3의배수입니다\n",n);
//			
//		if(n%2==1 && n%5==0)
//			System.out.printf("%d 는 홀수이면서 5의배수입니다\n",n);
		
		if(n%2==0) {
			
			if(n%3==0)
				System.out.printf("%d 는 짝수이면서 3의배수입니다\n",n);
			
		}else {
			
			if(n%5==0)
				System.out.printf("%d 는 홀수이면서 5의배수입니다\n",n);
		}
		
		sc.close();
		
	}

}
