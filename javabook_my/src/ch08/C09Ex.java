package ch08;

import java.util.Scanner;

//---------------------------------------------
	//명품자바 1번 문제
	//----------------------------------------------
//class TV {
//	private String brand;
//	private int year;
//	private int inch;
//	TV(String brand, int year, int inch){
//		this.brand = brand;
//		this.year = year;
//		this.inch = inch;
//	}
//	public void show() {
//		System.out.println(brand+"에서 만든 "+year+"년형 "+inch+"인치 TV");
//	}
//}
//-------------------------------------------------------------------

//---------------------------------------------
//명품자바 2번 문제
//--------------------------------------------

class Grade{
	int math;
	int science;
	int english;
	
	public Grade(int math, int science, int english) {
		super();
		this.math = math;
		this.science = science;
		this.english = english;
	}
	public int avg() {
		return (math+science+english)/3;
	}
	
}
public class C09Ex {
	//package Ch08Ex;
	//
	//public class C00문제 {
//		--------------------------------------------
//		문제 - 이것이자바다
//		--------------------------------------------
//		https://scksk.tistory.com/6
	//
//		클래스 기본문제
//		1~7번 확인하기 
	//
//		12번-16번 확인하기
	//
//		--------------------------------------------
//		--추가(명품자바)
//		--------------------------------------------
//		https://security-nanglam.tistory.com/213
	//
	//
	
	//---------------------------------------------
	//명품자바 1번 문제
	//----------------------------------------------
//	public static void main(String[] args) {
//		
//		   TV myTV = new TV("LG", 2017, 32); 
//		   myTV.show();
//		}
	//LG에서 만든 2017년형 32인치 TV
	//-----------------------------------------------

	
	//---------------------------------------------
	//명품자바 2번 문제
	//--------------------------------------------
	public static void main(String[] args) {
		   // TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	
		   System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
		   int math = sc.nextInt();
		   int science = sc.nextInt();
		   int english = sc.nextInt();
		   Grade me = new Grade(math, science, english);
		   System.out.println("평균은 "+me.avg()); // average()는 평균을 계산하여 리턴
	
	}
	
	
//		--------------------------------------------
//		--추가
//		--------------------------------------------
//		https://iu-corner.tistory.com/entry/JAVA-%EC%9E%90%EB%B0%94-%ED%81%B4%EB%9E%98%EC%8A%A4-%EC%97%B0%EC%8A%B5-%EB%AC%B8%EC%A0%9C-%EB%AA%A8%EC%9D%8C-1
	//
}
