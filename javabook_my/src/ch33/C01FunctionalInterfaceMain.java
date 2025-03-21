package ch33;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface			//함수형인터페이스 선언 컴파일러에게 함수형임을 알림
interface Func1{
	void say(String message);	//추상메서드
//	void say2(String message);	//추상메서드, 함수형 인터페이스는 추상 메서드가 하나여야만 한다.
	
}

@FunctionalInterface			
interface Func2{
	int sum(Integer...args);	//추상메서드
}


@FunctionalInterface			
interface Func3{
	List<Integer> createListDesc(int...args);	//추상메서드
}
public class C01FunctionalInterfaceMain {
	public static void main(String[] args) {
			//01
//		Func1 func1 = (message)->{System.out.println(message+"_!");};
//		func1.say("HELLOWORLD");
//		
//		Func1 func1_1 = System.out::println;
//		func1_1.say("HELLOWORLD");
//		
//		
//		//02
//		Func2 func2 = (itmes)-> {	//{}에 모든 items를 더한값을 리턴(반복문으로 items의 item을 누적한 값을 리턴
//				int sum = 0;
//				for(Integer el : itmes)
//					sum+=el;
//				return sum;
			
//		};
		//{}에 모든 items를 더한값을 리턴(반복문으로 items의 item을 누적해서 리턴)
		
//		Func2 func2= (items)->{return Arrays.stream(items).reduce(0,(sum,el)->sum+el);
		Func2 func2= (items)->{return Arrays.stream(items).reduce(0,Integer ::sum);}; //{}에 모든 items를 더한값을 리턴
		
		System.out.println(func2.sum(10,20,30,40,556,6,7,8,9));
		
		//03
		//원시타입 int[] 받기 -> 내림차순 -> int를Integer로 boxing -> List<Integer>변환
		Func3 func3 = (items)->{
			return Arrays.stream(items)
			.boxed()	//boxing 처리
			.sorted((a,b)->{return b-a;}) //내림차순
			.collect(Collectors.toList());	//컬렉션 리스트로 변환
			
		
			
		};
		List<Integer> li =func3.createListDesc(10,100,24,1612,42,123,15,4,1);
		System.out.println(li);
	}
}
