package ch08EX;

import java.util.Scanner;

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
public class C03EX {

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
}
