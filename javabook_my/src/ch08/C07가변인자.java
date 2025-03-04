package ch08;


class C07Simple{
	
	int sum(int ...arg) {  //몇 개의 값이 들어갈 지 모르니 받는 가변인자. 공간이 허용하는 한에서 무한으로 들어감
		System.out.println(arg);
		int s=0;
		//개량for문
		for(int item : arg) {		
			System.out.println(item);
			s+=item;
		}
		return s;
	}
}

public class C07가변인자 {

	public static void main(String[] args) {
		C07Simple ob = new C07Simple();
		ob.sum(10,20,30,40,50);
		System.out.println();
		ob.sum(10,20,30,40,50,60,70,80,90,100,110);
		
	}

}
