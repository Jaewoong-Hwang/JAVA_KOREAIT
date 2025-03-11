package ch17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C07MapEx {
	static Map<String,Object> map = new HashMap();
	//01 함수의 파라미터 형으로 사용되는 경우
	public static void setMap(Map<String,Object> parmas) {
		//params를 console에 저장
		//params를 map에 저장
		Map <String,Object>params = new Map();
	
	}
	
	
	public static Map<String,Object> func2(){
		return null;
	}
	
	public static void main(String[] args) {
		//01 파라미터 생성
		Map<String,Object> params = new HashMap();
		//02 데이터 전달
		String[] value = {"정보처리기사", "빅데이터분석기사","네트워크 관리사","--"};
		
		
		List<String> hobby = new ArrayList();
		hobby.add("등산");
		hobby.add("독서");
		hobby.add("게임");
		map.put("취미", hobby);
		func1(map);
	
		
		//03 데이터 확인
		//getMap이용해서 저장된 데이터 확인(출력)
	}
}
