package ch03;

public class c07StringTypeChange {

	public static void main(String[] args) {
		// --------------------------
		// 문자열+문자열
		// ------------------------

//		System.out.println("문자열1" + "문자열2");
//		System.out.println("문자열1" + "문자열2");			//문자열 + 문자열
//		System.out.println("문자열1" +','+ "문자열2");		//문자열 + 문자
//		System.out.println("문자열1" + 2);				//문자열 + 숫자
//		System.out.println("문자열1" +','+ '!');			//왼쪽부터 연산처리가 되기 떄문에 연결해서 문자열로 나옴
//		System.out.println(',' + '!' +"문자열");			//단일문자는 숫자로 취급해서 77이라는 숫자가 나오는 것임
//		System.out.println("문자열1" + "문자열2");

		// ---------------------------
		// 문자열 ->숫자형 변환
		// --------------------------
		// 문자열 -> 숫자형으로 변환(정수)
		// int n1 ="10";

		System.out.println("10" + "20");	//문자열 연결
		int n1 = Integer.parseInt("10");	//웹개발코드시 폼으로부터 전달받은 값
		int n2 = Integer.parseInt("20");
		System.out.println(n1 + n2);

		// 문자열 -> 숫자형으로 변환(실수)
		double n3 = Double.parseDouble("10.5");
		double n4 = Double.parseDouble("20.4");
		System.out.println(n3 + n4);

		short n5 = Short.parseShort("5");
		short n6 = Short.parseShort("6");

		System.out.println(n5 + n6);

	}

}
