package j13_genCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//*** 해싱과 해시함수 => 정석 651p
//해싱 => 해시 함수를 이용해서 데이터를 해시 테이블에 저장하고
//		 검색하는 기법

//*** Map ( Key, Value )
//=> HashMap (Key 값의 중복을 허용하지 않고, 순서 유지를 보장받지 못한다.) 
//=> TreeMap (Key 값의 중복을 허용하지 않고, 키값으로 오름차순 정렬이 된다.)
//=> LinkedHashMap (Key 값의 중복을 허용하지 않고, 입력순서 유지를 보장받는다.)

//*** HashMap : Key, Value 정보 지정
//=> key 는 유일, Value 는 중복 허용 
//=> null 값 허용 map.put(null, null) 또는 map.get(null) 가능

public class Ex09_HashMap {

	public static void main(String[] args) {
		// 1. HashMap
		// 1.1) 정의
		Map<Integer, String> hm = new HashMap<Integer, String>();
		// 1.2) put
		// => Key: 중복불허, Value: 중복무관
		hm.put(1,"Python");
		hm.put(10,"Servlet");
		hm.put(2,"Java");
		hm.put(20,"Jsp");
		hm.put(3,"JDBC");
		hm.put(30,"Spring");
		hm.put(4,"HTML");
		hm.put(5,"Java");
		hm.put(3,"Oracle"); 
		// key 중복 : 컴파일오류 없고 나중 값이 보관됨 
		
		// 1.3) 출력
		System.out.println("** HashMap => "+hm);
		// 1.4) 활용	
		// => get, remove, size
		// => key 로 접근
		System.out.println("** HashMap size => "+hm.size());
		System.out.println("** HashMap get(4) => "+hm.get(4));
		System.out.println("** HashMap remove(3) => "+hm.remove(3));
		System.out.println("** HashMap get(4) => "+hm.get(4));
		System.out.println("** HashMap After => "+hm);

		// 2. 각종 Map 비교
		//=> TreeMap (Key 값의 중복을 허용하지 않고, 키값으로 오름차순 정렬이 된다.)
		//=> LinkedHashMap (Key 값의 중복을 허용하지 않고, 입력순서 유지를 보장받는다.)
		Map<Integer, String> tm = new TreeMap<Integer, String>(hm);
		System.out.println("** TreeMap => "+tm);
		
		Map<Integer, String> lm = new LinkedHashMap<Integer, String>(hm);
		System.out.println("** LinkedHashMap 1 => "+lm);
		// => hm 의 입력 순서가 아닌 57행에서 전달된 순서가 적용됨
		// => 입력순서 확인
		lm = new LinkedHashMap<Integer, String>();
		lm.put(1,"Python");
		lm.put(10,"Servlet");
		lm.put(2,"Java");
		lm.put(20,"Jsp");
		lm.put(3,"JDBC");
		lm.put(30,"Spring");
		lm.put(4,"HTML");
		lm.put(5,"Java");
		System.out.println("** LinkedHashMap 2 => "+lm);
	} //main
} //class
