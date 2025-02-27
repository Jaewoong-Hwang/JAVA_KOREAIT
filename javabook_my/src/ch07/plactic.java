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

//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		int i = n;
//		int num = 0;
//		
//		while(i<=m) {
//			if(i%5==0) {
//				System.out.println("i : " + i);
//				num++;
//				
//			}
//			i++;
//		}
//		System.out.println(num);
//-----------------------------------------------
//		3️⃣ 입력한 숫자가 소수인지 판별하는 프로그램 만들기
//		while 문을 활용하여 2부터 N-1까지 나누어 떨어지는 수가 있는지 확인
//		예시 입력: N = 13
//		예시 출력: 13은 소수입니다.

//		Scanner sc = new Scanner(System.in);
//        
//        System.out.print("N 입력: ");
//        int n = sc.nextInt();
//        
//        boolean isPrime = true;  // 소수 여부를 저장하는 변수 (초기값: true)
//
//        if (n < 2) {
//            isPrime = false;  // 1 이하는 소수가 아님
//        } else {
//            int i = 2;  // 2부터 시작
//            while (i < n) {
//                if (n % i == 0) {  // n이 i로 나누어 떨어지면 소수가 아님
//                    isPrime = false;
//                    break;  // 소수가 아님이 확인되면 더 이상 검사할 필요 없음
//                }
//                i++;  // i를 1 증가 (다음 숫자로 이동)
//            }
//        }
//
//        // 결과 출력
//        if (isPrime) {
//            System.out.println(n + "은(는) 소수입니다.");
//        } else {
//            System.out.println(n + "은(는) 소수가 아닙니다.");
//        }
        
        
//		4️⃣ 숫자를 입력받아, 해당 숫자의 약수를 모두 출력하라.
//		while 문을 사용하여 1부터 N까지 반복하며 나누어 떨어지는 수 출력
//		예시 입력: N = 12
//		예시 출력: 12의 약수: 1, 2, 3, 4, 6, 12
        
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(n + "의 약수: ");
//        int i = 1;
//        while(i<=n) {
//        	if(n%i==0) {
//        		System.out.println(i + " ");
//        	}
//        	i++;
//        }
      
        

//		5️⃣ ATM 기계 - 출금 가능한 최소 지폐 개수 계산
//		사용자가 금액을 입력하면, 50000원, 10000원, 5000원, 1000원 단위로 최소 개수의 지폐를 출력
//		예시 입력: 금액 = 126000
//		예시 출력:
//		makefile
//		복사
//		편집
//		50000원: 2장  
//		10000원: 2장  
//		5000원: 1장  
//		1000원: 1장  
		
		Scanner sc = new Scanner (System.in);
		System.out.println("금액을 입력하세요");
		int pay = sc.nextInt();
		
		while(pay<1000) {
			System.out.println("1000원 이상의 값을 넣어주세요. 단, ");
		}
		pay= sc.nextInt();
		
		
	}
}
