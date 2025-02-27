package ch07;

import java.util.Scanner;

public class plactic {

	public static void main(String[] args) {
		
//		1부터 N까지의 숫자 중 3의 배수의 합을 구하라.
//		while 문을 사용하여 1부터 N까지 반복하면서 3의 배수만 더하기
//		예시 입력: N = 10
//		예시 출력: 3의 배수 합: 18 (3+6+9)
		
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		
//		while(i<=n) {
//			if(i%3 == 0) {
//				System.out.println("i : " + i);
//			sum+=i;
//			}
//			i++;
//		}
//		System.out.println("3의 배수의 합은 : " + sum);
		
//		
//		N부터 M까지 숫자 중 5의 배수 개수 구하기
//		while 문을 사용하여 N부터 M까지 반복하며 5의 배수 개수를 세기
//		예시 입력: N = 7, M = 25
//		예시 출력: 5의 배수 개수: 4 (10, 15, 20, 25)		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int i = n;
		int num = 0;
		
		while(i<=m) {
			if(i%5==0) {
				System.out.println("i : " + i);
				num++;
				
			}
			i++;
		}
		System.out.println(num);
		
		
		
		
		
	}

}
