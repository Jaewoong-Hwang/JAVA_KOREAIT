package ch07;

import java.util.Scanner;

public class c01While {

	public static void main(String[] args) {

		// 가독성을 높이고 공간활용을 하는 데 반복문이 사용된다

		// 10번 반복 - "HELLOWORLD"
		// 탈출용 변수 : i = 0;
		// 탈출용 조건식 : i<10
		// 탈출용 연산식 : i++
		// while(조건식){
//		조건식이 true 인동안 실행되는 종속문장
//	}

		// 01기본 - HELLOWORLD 10회 반복
//		int i = 0;
//		while (i < 10) {
//			System.out.println("HELLOWORLD");
//			i++;
//		}

		// 01기본 - HELLOWORLD 10회 반복
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 0;
//		while (i < n) { // 0부터 ~ n 까지
//			System.out.println("HELLOWORLD");
//			i++;
//		}

		// 03 기본 - 1부터 10까지의 합

//		int i = 1; //탈출용변수
//		int sum = 0; //누적합 변수
//		while(i<=10) //탈출 조건식
//		{
//			System.out.println("i :" + i);
//			sum = sum + i;
//			i++;	//탈출용 연산식
//		}
//		System.out.println("SUM : " + sum);

		// 04 기본 -1 부터 N까지 합
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int sum = 0;
//		while(sum<n) {
//			sum = sum + n;
//			n++;		
//		}
//		System.out.println("SUM : " + sum);

		// 05 기본 - N부터 M까지 합(N<M) - N>=M인 경욱 N과 M을 Swap하고 진행한다
//		Scanner sc = new Scanner(System.in);
		
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		if(n>=m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		int i =1;
//		int sum=0;
//		while(i<=m) {
//			System.out.println("i : " + i );
//			sum = sum + i;
//			i++;
//			
//		}
//		System.out.println("SUM : " + sum);
		

	}
}
