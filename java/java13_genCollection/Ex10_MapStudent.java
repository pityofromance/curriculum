package j13_genCollection;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import j07_APITest.Ex05_Student;

// ** Student Map Test
// => Ex05_Student 객체 5개 HashMap 에 넣고 출력하기

public class Ex10_MapStudent {

	public static void main(String[] args) {
		//1. HashMap 정의
		Map<Integer, Ex05_Student> sm = new HashMap<Integer, Ex05_Student>();
		
		//2. put
		sm.put(1, new Ex05_Student("030213-3039444","Banana", 70, 80));
		sm.put(2, new Ex05_Student("990314-2039444","Apple", 90, 88));
		sm.put(3, new Ex05_Student("880528-1659884","Grape", 50, 100));
		sm.put(4, new Ex05_Student("000713-4039888","Melon", 76, 76));
		sm.put(5, new Ex05_Student("030213-1039999","Lemon", 100, 100));
		
		// => 수정 & 삭제
		sm.get(3).setName("홍길동");
		sm.remove(4);
		
		//3. 출력
		System.out.println(sm);
		
	} //main
} //class
