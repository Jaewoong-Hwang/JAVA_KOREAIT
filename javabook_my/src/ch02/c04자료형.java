package ch02;

public class c04자료형 {

	public static void main(String[] args) {
		// ------------------원시타입(c언어로 부터 물려 받음, 기본 자료형===선 공간
		// 형성-------------------------------
		// byte (1byte) / 음수양수
		// short (2byte) / 음수양수
		// char(2byte) / 양수값만 지원
		// ----> 숫자나 문자나 모두 2진수로 담아낼 수 있지만 단일 문자는 양수값만 지원하는 char 로 담아낸다 --> 이유는 아스키코드에서는
		// 양수만 쓰기 때문에

		// int (4byte) / 기본 /음수양수
		// long (8byte) / 음수양수
		// float(4byte 실수)
		// double(8byte - 기본 실수) 실수 값은 연산하면 문제가 많이 발생하기 때문에 올림해서 정수로 쓰는 것이 기본임

		// char(2byte)

		// -----------------------------------------------------------------------------------------------

		// String(클래스 자료형) 동적공간 할당---들어가려는 데이터에 따라 공간이 형성됨!

//		//-------------
//		//정수 int - 4byte 정수 부호  o
//		//-----------------------
//		int n1 = 0b10101101; //2진수값   0b~~ 2진
//		int n2 = 173; //10진정수값
//		int n3 = 0255; //8진수		0~~8진수
//		int n4 = 0xad; //16진수     0x~~ 16진수
//		System.out.printf("%d %d %d %d\n", n1, n2, n3, n4);

		// -----------------
		// 정수 byte -1byte 정수 부호 o
		// --------------------
		
		
		//<형변환>
//		byte n5 = (byte) -129;  //데이터 손실이 생겨도 진행 --> 강제 형변환
//		System.out.println(n5); //----------데이터 손실로 127이 나옴. ----------->자료형은 형변환을 맞춰줘야 함
//		byte n6 = -30;
//		byte n7 = 30;
//		byte n8 = 127;
//		byte n9 = 129; // 왜 컴파일 에러가?-------------------byte는 127까지만 담을 수 있음
//		System.out.printf("%d\n", n9); // 왜??
//		System.out.println(0b10101101); // 왜 ?? int 자료형에 들어가기 때문에 데이터 손실이 없음
//		System.out.println(Integer.toBinaryString(-129));

		
		
//		//-------------------------
//		//정수 short-2byte정수 부호 o | char-2byte정수 부호x(양수만)
//		//--------------------------
//														//상수pool을 쓰는 이유는 메모리를 효율적으로 관리하기 위해서임
//		char n1 = 65535; //(0~2^16-1) (0~65535)
//		short n2 = 32767; //(-2^15 ~ +2^15-1)(-32768 ~ + 32767)
//		
//		char n3=60000;
//		short n4 = n3; //문제발생		공간의 크기가 같다고 해서 무조건 형변환이 되는 건 아님
//		System.out.printf("%d\n", n4);
		
		
		
		
//		//--------------------------
//		//정수 long-8byte 정수 부호 o
//		//---------------------------
		
//		long n1 = 10000000000L;		//4byte int 정수 공간에 담아낼 수 없음 --->L 를 붙여 넣음으로, long 값으로 전환 
//		long n2 = 20;  //L,l (리터럴접미사) : long 자료형 사용하여 값 저장
//		
//		long n3 = 10000000000; //문제발생
//		long n4 = 10000000000L;
		
		
		//-------------------------
		//실수
		//------------------------
		//유리수와 무리수의 통칭
		//소숫점이하값을 가지는 수 123.456			실수값을 계속해서 연산하다보면 오류가 많다. 오차 + 오차 +오차... 실측값과 멀어질 수 밖에 없다. 
		//float : 4byte 실수 (6-9자리)
		//double : 8byte 실수(15-18자리). 기본자료형
		
		//정밀도 확인
//		float n1 = 0.123456789123456789F; //f, F:float형 접미사
//		double n2 = 0.123456789123456789; 
//		
//		
//		//소수점 : 고정 소수점, 부동 소수점(현재)
//	
//		
//		System.out.println(n1);
//		System.out.println(n2);
//		
//		//오차 확인
//		float num = 0.1F;
//		for(int i=0;i<=1E7;i++) {
//			num = num +0.1F;
//			System.out.println(i);
//		}
//		System.out.println("num: " + num);
		
		
		//--------------------
//				단일문자 char 2byte 정수					
//				--------------------						//숫자나 문자나 모두 숫자로 담아낸다
//															//단일 문자는 아스키코드를 참고
				char ch1 = 'a';								//숫자로 처리되기 때문에 연산작업도 가능하다
				System.out.println(ch1);
				System.out.println((int)ch1); // 011000001
			
//				
				char ch2 = 98;
				System.out.println(ch2);
				System.out.println((int)ch2); // 011000010
//				
				char ch3 = 'b'+1;
				System.out.println(ch3);
				System.out.println((int)ch3); // 011000011
				
				byte ch4 = 'c'+2;
				System.out.println((char)ch4);
				System.out.println(ch4); // 011000011
				
//				char ch5  = 0xac00;
//				char ch6 = 44032;
////				
//				System.out.println(ch5);
//				System.out.println(ch6);
//				System.out.println((char)(0b1010110000000000+1));
				 
//				char ch6 = 0xac00+1;
//				System.out.printf("%c %c\n", ch5,ch6);
////				
//				// \\u :유니코드값 이스케이프문자
//				System.out.printf("%c\n", '\uACa1');
//				    
//				System.out.printf("TEST : %c\n", '\uabcd');
//				
//				
//				char n = 10;
//				System.out.printf("HELLO %c WORLD", n);
				
				
				//--------------------
				//문자열 : String (클래스자료형)
				//--------------------
				
				//기본자료형(원시타입)
//				byte n1;
//				short n2;
//				double n3;
//				long n4;
				
				//클래스자료형
				//클래스자료형으로 만든변수는 '참조변수'라고 하고
				//참조변수는 데이터가 저장된 위치정보(메모리주소값)이 저장된다.
//				int n1 = 10;
//				byte n2 = 20;
//				char n3 = 40;
//				
//				String name = "홍길동";
//				String job = "프로그래머";
//				System.out.println(name);
//				System.out.println(job);

				//--------------------
				//boolean : 논리형(true/false 저장)
				//--------------------
				
//				boolean flag = (10>11); 	// 참(긍정)
//				if(flag) 
//				{
//					System.out.println("참인경우 실행");
//				}
//				else 
//				{
//					System.out.println("거짓인경우 실행");
//				}
		
	}

}
