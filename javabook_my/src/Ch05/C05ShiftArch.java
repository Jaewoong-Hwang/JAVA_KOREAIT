package Ch05;

public class C05ShiftArch {
	public static void main(String[] args) {
		int num1 = 15;		//00000000 00000000 00000000 00001111
		int num2 = 20;		//00000000 00000000 00000000 00010100
		int num3 = num1<<3; //00000000 00000000 00000000 01111000      15*2의 3승
		int num4 = num1>>3; //00000000 00000000 00000000 00000001
		
//		System.out.println("<<Shift 연산결과 :" + num3);
//		System.out.println(">>Shift 연산결과 :" + num4);
		
		//제한된 공간에서 비트를 밀어낼 때 사용
	}
}	
