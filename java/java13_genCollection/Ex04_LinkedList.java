package j13_genCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import j07_APITest.Ex04_Person;

//ppt 12 ~ 17
//** List 인터페이스 (ppt 18, 23)
//=> List의 특징 : 순서가 있으며 중복된 원소를 가질 수 있다.
//=> 구현 클래스 : ArrayList, LinkedList

//** LinkedList<E>  
//=> ArrayList 및 배열의 단점을 보완하여 고안됨.   
//=> 장점 
//	1) 저장공간을 늘리는 과정이 간단.
//	2) 자료 입력 & 삭제 과정이 단순.
//=> 단점 : 순차처리의 access time 이 느리다.
//=> 빈번하게 삽입과 삭제가 일어나는 경우에 사용 

//** ArrayList<E> 
//=> 순서를 유지하며 중복을 허용하는 자료구조  
//=> 배열(Array)의 향상된 버전 또는 가변 크기의 배열이라고 생각하면 된다. 
//=> 장점 : 자료구조가 간단하며 사용이 쉽고 순차처리의 access time이 가장 빠르다.
//=> 단점
//1) 크기 변경시 새로운 배열을 생성해서 복사해야 하므로 비효율적
//2) 비순차적인 자료의 추가,수정,삭제시에 복사 및 이동 때문에 비효율적
//=> 크기가 일정하고 비순차적인 자료 수정이 발생하지 않는 경우 유리. 

//---------------------------------
//** source Code class header 참고
//public class LinkedList<E>
//	extends AbstractSequentialList<E>
//	implements List<E>, Deque<E>, Cloneable, java.io.Serializable
//{

//public class ArrayList<E> extends AbstractList<E>
//	implements List<E>, RandomAccess, Cloneable, java.io.Serializable
//{
//---------------------------------

public class Ex04_LinkedList {

	public static void main(String[] args) {
		// 1. 정의
		LinkedList<String> list = new LinkedList<String>() ;
		// ** 다형성 적용
		List<Double> list2 = new LinkedList<Double>();
		
		// 2. add
		list.add("Java");
		list.add("Html");
		list.add("CSS");
		list.add("Servlet");
		list.add("JSP");
		list.add("Java");
		
		// 3. 활용 : remove, set, add(끼워넣기) 
		list.remove(1);
		list.set(1, "Update"); // CSS -> Update
		list.add(2,"Oracle");
		// 4. 출력
		for (String s:list) {
			System.out.print(s+" ");
		}
		System.out.println("");
		
		// 5. Person 적용
		List<Ex04_Person> plist = new LinkedList<Ex04_Person>();
		plist.add(new Ex04_Person("890909-1234567","홍길동1"));
		plist.add(new Ex04_Person("900909-2234567","홍길동2"));
		plist.add(new Ex04_Person("910909-1234567","홍길동3"));
		for (Ex04_Person p:plist) {	p.infoPrint(); }
		
		// 6. 배열 -> List -> Iterator 로 변환하기
		String[] city = {"서울", "부산", "뉴욕", "파리" } ;
		List<String> clist = Arrays.asList(city);
		Iterator<String> ilist = clist.iterator();
		// Iterator : 순차처리를 편리하게 지원해주는 클래스
		// => hasNext(), next() 메서드를 이용
		while(ilist.hasNext()) {
			System.out.println(ilist.next());
		}

	} //main
} //class
