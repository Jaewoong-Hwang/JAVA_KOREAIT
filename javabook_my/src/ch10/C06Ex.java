package ch10;

import java.util.Arrays;
import java.util.Scanner;



public class C06Ex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.println("5개의 정수 입력");
//		int[] arr1 = new int[5];
//		for (int i = 0; i < arr1.length; i++) {
//
//			arr1[i] = sc.nextInt();
//		}
//		int sum = 0;
//		for(int el : arr1) {
//			sum+=el;
//		}
//		
//		
//		System.out.println("최대값 : " + Arrays.stream(arr1).max().getAsInt());
//		System.out.println("최소값 : " + Arrays.stream(arr1).min().getAsInt());
//		System.out.println("전체합 : " + sum);		
//		System.out.println("----------------");
		
		int [][] scores = new int[5][3];
		for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "번 학생의 점수를 입력하세요 (국어, 영어, 수학): ");
            for (int j = 0; j < 3; j++) {
                scores[i][j] = sc.nextInt();
            }
        }
	
		int koreasum = 0;
		for(int korea = 0; korea<scores[5][1];) {
			koreasum+=korea;
		}
		System.out.println("국어총점 : " + koreasum);
		
		
	}
		
	
		
}
