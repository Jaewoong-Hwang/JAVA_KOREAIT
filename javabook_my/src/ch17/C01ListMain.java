package ch17;

import java.util.ArrayList;
import java.util.List;

public class C01ListMain {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		//추가
		list.add("HTML/CSS/JS");
		list.add("JQUERY");
		list.add("NODEJS");
		list.add("SCSS");
		list.add("REACT");
		list.add("JAVA");
		list.add("JSP/SERVLET");
		list.add("STS");
		list.add("SPRING BOOT");
		list.add("SPRING BOOT"); //데이터 중복이 가능
		
		//조회
		System.out.println("개수 확인 : " + list.size());
		System.out.println("idx 로 조회 : " + list.get(2));
		System.out.println("Value 로 idx 확인 : " + list.indexOf("JAVA"));
		list.forEach(System.out::println);
		System.out.println("-----");
		//삭제
		list.remove(0);
		list.remove("JQUERY");
		for(String el : list) {
			System.out.println(el);
		}
		
		//전체 삭제
		list.clear();
	}
}
