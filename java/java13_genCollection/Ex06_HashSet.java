package j13_genCollection;

import java.util.HashSet;
import java.util.Iterator;


//** Set : ppt 30 p
//=> 원소의 중복을 허용하지 않고, 순서가 없음
//=> HashSet, TreeSet, LinkedHashSet

//** HashSet
//=> HashSet은 해쉬 테이블에 원소를 저장하기 때문에 성능면에서 가장 우수,
//   하지만 원소들의 순서가 일정하지 않은 단점이 있다.

//** Iterator 클래스 를 이용한 처리 (출력등..)
//=> 배열 -> Set
//=> Set -> Iterator : 순차 처리 적용

public class Ex06_HashSet {

	public static void main(String[] args) {
		// 1. 정의
		// => 순서 없고, 중복 불가
		// => 동일성 Test
		//    제네릭을 적용하지 않거나, Object Type 인경우
		//    값은 같지만 Type 이 다른 경우 Test (다른 데이터로 취급)
		// 1.1) Object
		Object[] ob = {"가", "나",new Integer(123), "가","나","다","123"};
		HashSet<Object> oset = new HashSet<>();
		for (Object o: ob) { 
			if (!oset.add(o)) 
				System.out.println("** 중복자료는 추가되지 않습니다 => "+o); 
		} 
		System.out.println("** oset => "+oset);
		
		// 1.2) String
		HashSet<String> set = new HashSet<String>();
		// 2. add
		set.add("짜장면");
		set.add("칼국수");
		set.add("짬뽕");
		set.add("짜장면"); // 중복은 허용하지 않음
		set.add("쌀국수");
		set.add("매운라면");
		// set.add(12345); XXXXX
		// 3. 출력
		System.out.println(set);
		
		// 4. 활용하기 ( 삭제, 크기확인 )
		// => Iterator 를 이용 : hasNext(), next() 적용가능
		// => 예) "국수" 가 포함된 자료는 제외하고 출력한다 
		
		// ** Iterator 를 이용한  순차처리
		// => 순차적으로 비교하면서 원하는 값 찾기, 삭제하기 
		// =>  iset 의 remove 는 set 에 반영됨
		Iterator<String> iset = set.iterator();
		while(iset.hasNext()) {
			if (iset.next().contains("국수")) iset.remove();
			// if (iset.next().equals("짬뽕")) set.add("탕수육"); 
			//  => 반복문 내부에서 set 접근시 : java.util.NoSuchElementException
		} //while
		System.out.println("** iset => "+iset); // 주소
		set.add("탕수육"); 
		System.out.println("** set => "+set);
		System.out.println("** set 크기 => "+set.size());
		
		// ** Iterator 인스턴스 재사용
		// Iterator 는 한번 사용을 마치면 자료를 포인트하는 커서가  
		// 끝에 가 있어 hasNext()가 false 를 return 하기 떄문에 
		// 재할당해야 한다.
		iset = set.iterator();
		while(iset.hasNext()) {
			String menu = iset.next();
			if (menu.contains("면")) 
				System.out.print(menu+"!!"+" ");
			else System.out.print(menu+" ");
		} //while
		
	} //main
} //class
