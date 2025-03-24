package Ch35;

import java.util.Scanner;

import Ch35.building.Barrack;
import Ch35.unit.Marine;
import Ch35.unit.Medic;

public class Main2 {

	static Barrack barrack = null;

	public static void main(String[] args) {
		
		//건물 생성
		new Thread() {
			
			
		}
		
	}.start();

	Scanner sc = new Scanner(System.in);
	int num = 0;while(true)
	{
		System.out.println("1 마린 생성");
		System.out.println("1 메딕 생성");
		System.out.println("1 종료 ");
		System.out.println("입력 : ");
		num = sc.nextInt();
		switch (num) {
		case 1:
			Marine marine = barrack.getMarine();
			System.out.println("marine : "+ marine);
			break;
		case 2:
			Medic medic = barrack.getMedic();
			System.out.println("medic : "+ medic);
			break;

		case 3:
			break;

		default:
			
		}
	}

}
