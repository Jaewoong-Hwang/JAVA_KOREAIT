package ch03;

public class c05TypeChange {

	public static void main(String[] args) {
		int num1 = 10, num2 =4;
		double dnum1 = num1 / num2;		//(double)num1 / num2;
		double dnum2 = num1 / num2;		//(num*1.0)===자동형변환  / num2;
		double dnum3 = num1 / num2;		
		
		System.out.println("dnum1 : " + dnum1);
		System.out.println("dnum2 : " + dnum2);
		System.out.println("dnum3 : " + dnum3);
	}

}
