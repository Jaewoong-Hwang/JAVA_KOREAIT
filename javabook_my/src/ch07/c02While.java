package ch07;

import java.util.Scanner;

public class c02While {

	public static void main(String[] args) {

		// 2단 - 9단 출력
//		Scanner sc = new Scanner(System.in);
//		int dan = 2;
//		while (dan < 10) {	
//			
//			int i = 1;
//			while (i < 10) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//
//				i++;
//			}
//			System.out.println();
//
//			dan++;
//		}

		// 2단 - 9단 출력 (2x9,2x8 , .... 9x9, ...9x1)
//		int dan = 2;
//		while(dan<10) {
//			int i =9;
//			while(i>0) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//		}

		// 9단 - 2단( 9x9 9x8 -2x1)
//		int dan = 9;
//		while(dan>1) {
//			int i =9;
//			while(i>0) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}

		// 2단 - N단(N<9)

		Scanner sc = new Scanner(System.in);
		System.out.print("단 수 입력 : ");
		int n = sc.nextInt();
//
		 while(n>9 || n<2){
			 

	}

		int dan = 2;
		while(dan<n+1) {
			int i =1;
			while(i<10) {
				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
				i++;
			}
			System.out.println();
			dan++;
		}

		// N단 - M단(N<M , N<9 , M<9)

//		Scanner sc = new Scanner(System.in);
//
//		int dan1 = sc.nextInt();
//		int dan2 = sc.nextInt();

//		if(dan1>dan2) {
//			int temp = dan1;
//			dan1 = dan2;
//			dan2 = temp;
//					
//		}

//		while(dan1>dan2 || dan1>9 || dan2>9) {
//			System.out.print("단1보다 단2가 더 큰 수여야 합니다. 다시 입력해주세요.");
//			dan1 = sc.nextInt();
//			dan2 = sc.nextInt();
//		}
//		
//		
//		
//		while (dan1 <= dan2) {
//			int i = 1;
//			while (i < 10) {
//				System.out.printf("%d x %d = %d\n", dan1, i, dan1 * i);
//				i++;
//			}
//			System.out.println();
//			dan1++;
//		}

		// 별찍기(기본높이:4)

		// *****
		// *****
		// *****
		// *****

		int i = 1;
		String star = "*";
		while (i <= 4) {

			System.out.println(star);

			i++;
		}

		// *
		// **
		// ***
		// ****

		// ****
		// ***
		// **
		// *

		// *
		// ***
		// *****
		// *******

		// *******
		// *****
		// ***
		// *

		// *
		// ***
		// *****
		// *******
		// *****
		// ***
		// *

		// *******
		// *****
		// ***
		// *
		// *
		// ***
		// *****
		// *******

	}

}
