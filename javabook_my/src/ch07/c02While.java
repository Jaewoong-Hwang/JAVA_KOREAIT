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

//		Scanner sc = new Scanner(System.in);
//		System.out.print("단 수 입력 : ");
//		int n = sc.nextInt();
//
//		 while(n>9 || n<2){
//			 
//
//	}
//
//		int dan = 2;
//		while(dan<n+1) {
//			int i =1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}

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

//		int height = 4; // 기본 높이
//		int width = 5; // 별의 개수
//
//		int i = 1;
//		while (i <= height) { // 행을 반복
//			int j = 1;
//			while (j <= width) { // 한 줄에 별을 출력
//				System.out.print("*");
//				j++;
//			}
//			System.out.println(); // 줄 바꿈 추가
//			i++;
//		}

		// 스케너로 받고 별 찍기
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int w = sc.nextInt();
//		
//		int i =1;
//		while(i <= h) {
//			int j=1;
//			while(j<=w) {
//				System.out.print('*');
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		// *
		// **
		// ***
		// ****

//		int height = 4;
//
//		int i = 1;
//		while (i <= height) {
//			int j = 1;
//			while (j <= i) {     //높이만큼 반복
//				System.out.print("*");
//				j++;
//
//			}
//			System.out.println();
//			i++;
//		}

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 1;
//		while(i<=h) {
//			int j = 1;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		// ****
		// ***
		// **
		// *

//		int height = 4;
//
//		int i = 1;
//		while (i <= height) {
//			int j = 4;
//			while (j >= i) {     //별의 수보다 i가 커지면 종료
//				System.out.print("*");
//				j--;
//
//			}
//			System.out.println();
//			i++;
//		}

		// *
		// ***
		// *****
		// *******

//		int height = 4;
//
//		int i = 1;
//		while (i <= height) {
//			int j = 1;
//			while (j <= (2*i-1) ) {     //별의 수만큼 높이를 반복
//				System.out.print("*");
//				j++;
//
//			}
//			System.out.println();
//			i++;
//		}

		// *******
		// *****
		// ***
		// *

//		int height = 4;
//
//		int i = 1;
//		while (i <= height) {
//			int j = 7;
//			while (j >= (2*i-1) ) {     //별의 수만큼 높이를 반복
//				System.out.print("*");
//				j--;
//
//			}
//			System.out.println();
//			i++;
//		}

		// *
		// ***
		// *****
		// *******
		// *****
		// ***
		// *

//		int h = 4;
//		int i = 1;
//		int step = 2;
//		int stars = 1;
//
//		while (stars > 0) {	
//			int j = 0;   // j의 값을 0으로 계속 초기화
//			while (j < stars) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			if(i < h) {
//				stars+=step;
//			}else {
//				stars-=step;
//			}
//			i++;
//		}

		// *******
		// *****
		// ***
		// *
		// *
		// ***
		// *****
		// *******

//		int i = 1;
//		int h = 4;
//		int step = 2;
//		int stars = 7;
//
//		while (i<=8) {
//			int j = 0;
//			while (j < stars) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			
//			if(i<h) {
//				stars-=step;
//			}else if(i==h){
//				stars=stars;
//			}else {
//				stars+=step;
//			}
//			i++;
//
//		}

			//   *
			//  ***
			// *****
			//*******
//		 int i =0;
//		 while (i < 4) {
//	            int j = 0; // 공백을 출력하는 변수
//	            while (j < 3 - i) { // 공백 개수: (N-1) - i
//	                System.out.print(" ");
//	                j++;
//	            }
//
//	            int k = 0; // 별을 출력하는 변수
//	            while (k < 2 * i + 1) { // 별 개수: (2 * i + 1)
//	                System.out.print("*");
//	                k++;
//	            }
//
//	            System.out.println(); // 줄 바꿈
//	            i++; // 다음 줄로 이동
//	        }
	
		
			
			//*******
			// *****
			//  ***
			//   *

		 
//		 int i =0;
//		 int h =4;
//		 
//		 while(i<h) {
//			 int j = 0;
//			 while(j<i) {
//				 System.out.print(" ");
//				 j++;
//			 }
//			 int k = 2*(h-i)-1;
//			 while(k>0) {
//				 System.out.print("*");
//				 k--;
//			 }
//			 System.out.println();
//			 i++;
//		 }
		 
			
			
			//   *
			//  ***
			// *****		
			//*******
			// *****
			//  ***
			//   *
		
//		int i =0;
//		while(i<7) {
//			
//			if(i<4) {
//				int j=0;
//				while(j<3-i) {
//					System.out.print(" ");
//					j++;
//				}
//				int k =0;
//				while(k<=2*i) {
//					System.out.print("*");
//					k++;
//				}
//			}else {
//				int j=0;
//				while(j<=i-4) {
//					System.out.print(" ");
//					j++;
//				}
//				int k=0;
//				while(k<=12-2*i) {
//					System.out.print("*");
//					k++;
//				}
//				
//				
//			}
//			System.out.println();
//			i++;
//			
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		int h = sc.nextInt();
//		while(h%2==0) {
//			System.out.print("홀수를 입력해주세요.");
//			h =sc.nextInt();	
//		}
//		
//		int i = 0;
//		while(i<h) {
//			
//			if(i<=h/2) {
//				int j = 0;
//				while(j< (h/2)-i) {
//					System.out.print(" ");
//					j++;
//				}
//				int k =0;
//				while(k<=2*i) {
//					System.out.print("*");
//					k++;
//					
//				}
//				
//			}else {
//				int j=0;
//				while(j<i-3) {
//					System.out.print(" ");
//					j++;
//				}
//				int k =0;
//				while(k<i*2-1) {
//					
//				}
//			}
//			
//		}
		
		
		
		
		
		
		
		
		
//		i(행)		j(공백)		k(별)
//		0		0-2				0-0
//		1		0-1				0-2
//		2		0-0				0-4
//		3		x				0-6
//		-----------------------------------------
//		i<=(h/2)	j=0			k=0
//					j++			k++
//					j<(h/2)-i	k<=2*i
//
//		4			0-0				0-4
//		5			0-1				0-2
//		6			0-2				0-0
//		-----------------------------------------
//					j=0				k=0
//					j++				k++
//					j<=i-(h/2+1)	k<=((h-1)*2)-2*i
				
//			
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		
//		int i=0;
//		while(i<h) {
//			
//			if(i<=(h/2)) {
//				//공백(↓)
//				int j=0;
//				while(j<(h/2)-i) {
//					System.out.print(" ");
//					j++;
//				}
//				//별(↑)
//				int k=0;
//				while(k<=2*i) {
//					System.out.print("*");
//					k++;
//				}
//				
//			}else {
//				
//				//공백(↑)
//				int j=0;
//				while(j<=i-(h/2+1)) {
//					System.out.print(" ");
//					j++;
//				}	
//				//별(↓)
//				
//				int k=0;
//				while(k<=((h-1)*2)-2*i) {
//					System.out.print("*");
//					k++;
//				}
//				
//			}
//			
//			System.out.println();
//			i++;
//		}
		
//		
		
//		Scanner sc = new Scanner(System.in);
//		 
//		 int h = sc.nextInt(); // 다이아몬드 전체 높이
//
//	        while (h % 2 == 0) { // 짝수 입력 방지
//	            System.out.println("홀수 값을 입력해주세요!");
//	           
//	            h = sc.nextInt();
//	        }
//	        
//
//	        int i = 0;
//	        int mid = h / 2; // 중앙 위치
//	        int stars, spaces;
//
//	        while (i < h) { // 총 h줄 출력
//	            if (i <= mid) { // 위쪽 삼각형 (중앙 포함)
//	                stars = 2 * i + 1;
//	                spaces = mid - i;
//	            } else { // 아래쪽 삼각형
//	                stars = 2 * (h - i - 1) + 1;
//	                spaces = i - mid;
//	            }
//
//	            // 공백 출력
//	            int j = 0;
//	            while (j < spaces) {
//	                System.out.print(" ");
//	                j++;
//	            }
//
//	            // 별 출력
//	            int k = 0;
//	            while (k < stars) {
//	                System.out.print("*");
//	                k++;
//	            }
//
//	            System.out.println(); // 줄 바꿈
//	            i++;
//	        }
		
		
		
			//*******
			// *****
			//  ***
			//   *		
			//   *
			//  ***
			// *****		
			//*******

		
	Scanner sc = new Scanner (System.in);
	int h = sc.nextInt();
	
	while(h%2==0) {
		System.out.print("홀수를 입력해주세요.");
	h = sc.nextInt();
	}
	
	int i = 0;
	while(i<=h) {
		if(i<=h/2) {
			int j = 0;
			while(j<i-(h/2)+3) {
				System.out.print(" ");
				j++;
			}
			int k = 0;
			while(k<h-(2*i)) {
				System.out.print("*");
				k++;
			}
			
			
		}else if(i>=h/2){
			int j= 0;
//			System.out.print("확");
			while(j<h-i) {
				System.out.print(" ");
				j++;
			}
			int k =0;
			while(k<2*i-h) {
				System.out.print("*");
				k++;
			}
			
			
			
		}
		System.out.println();
		i++;
		
	}
	
	
		
		
		
	}

}
