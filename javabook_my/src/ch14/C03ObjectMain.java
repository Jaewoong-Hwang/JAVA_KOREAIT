package ch14;

import java.util.Objects;

class C03Simple {
	int n;

	C03Simple(int n) {
		this.n = n;
	}

	@Override
	public boolean equals(Object obj) {
		//
		if(obj instanceof C03Simple) {	// C02Simple로 만든 객체인지 확인 
			C03Simple down = (C03Simple)obj; // 다운캐스팅
			
			return this.n==down.n; // 같은지 비교  
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return  Objects.hash(this.n);
	}
	
	
}

public class C03ObjectMain {
	public static void main(String[] args) {
		C03Simple ob1 = new C03Simple(1);
		System.out.println(ob1.toString());
		System.out.printf("%x\n",System.identityHashCode(ob1));
		
		C03Simple ob2 = new C03Simple(9);
		System.out.println(ob2.toString());
		
	}
}
