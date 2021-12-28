package j13_genCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

//** HashSet 을 이용한 로또번호 생성하기
//=> 중복자료가 허용안되는 Set 의 특징을 이용하여 로또 번호 생성하기
//=> Random 또는 Math 로 1 ~ 45 범위내의 정수를 중복되지 않도록 
//   6개를 추출후 출력하기
//=> 오름차순으로 출력하기	

public class Ex07_SetLotto {
	
	public static void main(String[] args) {
		// 1. set 정의
		HashSet<Integer> set = new HashSet<Integer>();
		// 2. 번호생성 & set에 담기
		// => Math, while 또는 for
		// => 조건 : set.size() 가 6이 될때까지
		//          자료가 없을때(size=0) 부터 시작 하므로 6 보다 작은동안
		/*
		while (set.size()<6) {
			int n =(int)(Math.random()*45+1);
			set.add(n);
		} //while
		*/
		// ** for 구문을 while 처럼 사용하기 
		// => for (;;) -> for 의 무한 Loop
		for (;set.size()<6;) {
			int n =(int)(Math.random()*45+1);
			set.add(n);
		}
		// 3. 출력
		System.out.println("** 정렬전 => "+set);
		// 정렬
		// 3.1) Arrays 활용
		// => set -> 배열로 
		Object[] aSet = set.toArray();  
		Arrays.sort(aSet);
		System.out.println("** Arrays.sort => "+Arrays.toString(aSet));
		
		// 3.2) Collections
		// => Collection 들의 WrapperClass
		//    Collection 과 관련된 편리한 메서드를 제공
		//    단, interface Collection 과 구별
		//        interface Collector 의 구현클래스 Collectors 와 구별
		// => Collections.sort(List<T> list)
		//    인자로 List 타입이 필요함

		// ** 오름차순 출력
		// => Set -> 순차구조 (Iterator , List)
		// => Set -> List
		//    LinkedList 의 생성자중에 set을 매개변수로 사용하면
		//    이 set 을 list 생성해주는 생성자가 있음.  
		List<Integer> list = new LinkedList<Integer>(set) ;
		Collections.sort(list);
		System.out.println("** 정렬후 => "+list); 
		
	} //main
} //class
