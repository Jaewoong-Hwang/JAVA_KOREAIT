package ch07;

import java.util.Scanner;

public class c02While {

	public static void main(String[] args) {

		// 2단 - 9단 출력
//		Scanner sc = new Scanner(System.in);
		int dan = 2;
		while (dan < 10) {	
			
			int i = 1;
			while (i < 10) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);

				i++;
			}
			System.out.println();

			dan++;
		}

		// 2단 - 9단 출력 (2x9,2x8 , .... 9x9, ...9x1)

		// 9단 - 2단( 9x9 9x8 -2x1)
	}

}
