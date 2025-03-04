package ch07;

public class c04For {

	public static void main(String[] args) {

////		int i=0; 		//탈출용 변수 선언
////		while(i<10) {	// 탈출용 조건식
////			System.out.println("HELLO WORLD");
////			i++;		//탙출용 연산식
////		}
//
//		for (int i = 0; i < 10; i++) {
//			System.out.println("HELLOWORLD");
//
//		}

		// 1-10까지 합
		// 1-N까지 합
		// N_M까지 합(N<M)
		// 2단 구구단
		// N단 구구단(2<=N<=9)
		// 2-9 구구단
		// 2-N 구구단
		// N-M구구단
		// 별찍기

		// *
		// ***
		// *****
		// *******
//			 int i =0;
//			 while (i < 4) {
//		            int j = 0; // 공백을 출력하는 변수
//		            while (j < 3 - i) { // 공백 개수: (N-1) - i
//		                System.out.print(" ");
//		                j++;
//		            }
//	
//		            int k = 0; // 별을 출력하는 변수
//		            while (k < 2 * i + 1) { // 별 개수: (2 * i + 1)
//		                System.out.print("*");
//		                k++;
//		            }
//	
//		            System.out.println(); // 줄 바꿈
//		            i++; // 다음 줄로 이동
//		        }

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3 - i; j++)
				System.out.print(" ");
			for (int k = 0; k < 2 * i + 1; k++)
				System.out.print("*");
			System.out.println();
		}

	}

}
