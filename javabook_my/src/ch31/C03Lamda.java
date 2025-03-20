package ch31;

interface Calculator{
	int calculator(int num1, int num2);
	
	
}


public class C03Lamda {
	public static void main(String[] args) {
		//덧셈
		Calculator add= (a, b) -> a + b;	
		//뺼셈
		Calculator sub= (a, b) -> a - b;
		//곱셈
		Calculator mul= (a, b) -> a * b;
		//나눗셈
		Calculator div= (a, b) -> a / b;
		
		

		
		
		//결과
		System.out.println(add.calculate(10,20));//덧셈
		System.out.println(sub.calculate(30,10));//뺄셈
		System.out.println(mul.calculate(10,20));//곱셈
		System.out.println(div.calculate(100,5));//니눗셈
		
	}
}
