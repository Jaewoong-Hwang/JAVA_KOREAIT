package ch17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class C04Ex {
	
	
	public static void main(String[] args) {
		//1) 1 ~ 45 까지 숫자 6개를 랜덤으로 받아(Random클래스를 이용) set에 저장 / 출력
		Set<Integer> set = new HashSet();
		Random rnd = new Random();
		while(set.size()<7) {
			set.add(rnd.nextInt(45)+1);
			
		}
		for(Integer val : set)
			System.out.print(val + " ");
		System.out.println("------------");
		//2) [추가]저장된 set의 오름차순 정렬을 해보세요(스트림함수 사용)
		List<Integer> li = set.stream().sorted().collect(Collectors.toList());
		li.forEach(System.out::print);
		
		
		
		//3)
		List<Integer> list = new ArrayList(set);
		Collections.sort(list);
		for(int num : list)
			System.out.print(num + " ");
		
	}	
	
}
