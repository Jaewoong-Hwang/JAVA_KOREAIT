package Ch09;

public class C04String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("---------------------------");
		System.out.println("str1==str2 ? " + (str1==str2));   //같은 길이의 문자열, 클래스의 상수풀에 같은 문자열을 공유. 
		System.out.println("str3==str4 ? " + (str3==str4));	  //new 힙 영역에 
		System.out.println("str1==str3 ? " + (str1==str3));
		System.out.println("str2==str4 ? " + (str2==str4));
	}

}
