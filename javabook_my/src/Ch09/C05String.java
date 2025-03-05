package Ch09;

public class C05String {

	public static void main(String[] args) {
//		String str1 = "Java Powerful";			// class 영역에 저장
//		String str2 = new String("java Programing");		// heap 영역에 저장
//		String str3 = str1 + str2;			//class 영역에 저장
//		String str4 = str1.concat(str2);	//concat 함수는 덧붙이기 함수임. 덧붙이기 과정을 통해 class에 새로운 공간을 만듦

//		System.out.printf("%X\n",System.identityHashCode(str1));
//		System.out.printf("%X\n",System.identityHashCode(str2));
//		System.out.printf("%X\n",System.identityHashCode(str3));
//		System.out.printf("%X\n",System.identityHashCode(str4));

		// -------------concat 과정-----------------------------------
//		int i = 0;
//		String str = "";
//		while(i<10) {
//			str +=i;
//			System.out.print("str : " + str + " ");
//			System.out.printf("위치 : %X\n",System.identityHashCode(str));
//			i++;

		
//		}
		// ----------계속해서 덧붙이게 되면 메모리가 가득 차게됨.----상수풀에 계속 메모리가 참
		
		
		//
		// 문자열 덧붙이기(메모리 누수 방지 클래스 : StringBuffer , StringBuilder))
		//StringBuilder
		int i = 0;
//		String str = "";
		StringBuilder str = new StringBuilder("");
		while (i < 10) {
//			str +=i;
			str.append(i);
			System.out.print("str : " + str + " ");
			System.out.printf("위치 : %X\n", System.identityHashCode(str));
			i++;
		}
		//------------------출려해보면 위치가 계속 같은 곳에 찍히게 된다.따라서 메모리 누수가 방지.

	}
}
