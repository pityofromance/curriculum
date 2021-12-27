package j13_genCollection;

import java.util.ArrayList;
import java.util.List;

import j07_APITest.Ex04_Person;

//ArrayList (ppt 18, 19 ~)

//** ArrayList<E> 의 저장용량  
//	=> 데이터가 증가하면 메서드 호출하지 않아도 저장용량은 자동증가 함
//	=> 필요시엔 미리 설정가능
//1) 생성자 
//	=> 초기값 지정 가능 :  new ArrayList<>(100) ;
//2) 메서드 이용
//	=> public void ensureCapacity(int minCapacity) : ArrayList 에 정의

public class Ex03_ArrayList {

	public static void main(String[] args) {
		// 1. 정의
		ArrayList<Integer> list = new ArrayList<Integer>();
				
		// ** 저장용량
		// => 필요시에 자동으로 늘려줌
		//    (매우 비효율적 : 큰공간을 할당하고 기존의 값들을 이동함 )
		// => 생성시에 할당가능 : 생성자 매개변수로 지정
		// => 기본용량 확인하기
		// ** 비교
		// 사이즈는 리스트의 요소의 수,
		// 용량은 리스트는 잠재적으로 그 내부구조를 재 할당없이 수용할 수있는 요소의 수
		System.out.println("** 기본크기1 => "+list.size());  // 0
		ArrayList<Integer> list2 = new ArrayList<Integer>(10);
		System.out.println("** 기본크기2 => "+list2.size()); // 0
		// => 도중에 변경도 가능 : 메서드 ensureCapacity
		list2.ensureCapacity(20);
		
		// ** 다형성 적용
		// => list3 인스턴스는 List 에 정의된 만큼만 접근가능
		List<Integer> list3 = new ArrayList<Integer>();
		// list3.ensureCapacity(20); -> ArrayList에 정의된 메서드에는 접근안됨
		
		// 2. add
		list.add(100);
		list.add(new Integer(200));
		list.add(300);
		list.add(400);
		list.add(500);
		
		// 3. get, set, remove (활용)
		int sum = list.get(0) + list.get(1) ;
		System.out.println("** sum => "+sum);
		System.out.println("** 크기1 => "+list.size());
		
		list.set(0, sum); // 수정
		list.add(2, 777); // 끼워넣기
		list.remove(3);   // 삭제
		System.out.println("** 크기2 => "+list.size());
		// 4. 출력
		for (int i:list) {
			System.out.print(i+" ");
		}
		System.out.println("");
		
		// 5. Person Type 으로 ArrayList 사용하기
		// => 정의, add, 출력
		ArrayList<Ex04_Person> plist = new ArrayList<Ex04_Person>(); 
		
		plist.add(new Ex04_Person("890909-1234567","홍길동1"));
		plist.add(new Ex04_Person("900909-2234567","홍길동2"));
		plist.add(new Ex04_Person("910909-1234567","홍길동3"));
		
		for (Ex04_Person p:plist) {	p.infoPrint(); }

	} //main
} //class
