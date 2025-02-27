package ch06;

import java.util.Scanner;

public class c02SWITCH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ranking = sc.nextInt();
		char medalColor;					//case 뒤에 들어가는 수는 상수만 가능. 조건식 불가능 ==> 판단에 제한이 걸려있음  
		switch (ranking) {
		case 1:
			medalColor = 'G';
			System.out.println("메달색상 : G");
			break;							// break는 switch 를 빠져나갈 때 사용
		case 2:
			medalColor = 'S';
			System.out.println("메달색상 : S");
			break;
		case 3:
			medalColor = 'B';
			System.out.println("메달색상 : B");
			break;
		default:
			medalColor = 'C';
			System.out.println("메달생상 : C");

		}
		System.out.println(ranking + " 등 메달의 색은" + medalColor + "입니다.");

	}

}
