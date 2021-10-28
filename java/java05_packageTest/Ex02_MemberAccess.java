package j05_packageTest;

import java.util.Scanner;

import j05_classMethod.Ex08_Member;

public class Ex02_MemberAccess {

	public static void main(String[] args) {
		
		// ** Member Test
		// => 생성자로 모든변수(필드) 초기화
		Ex08_Member m1 = new Ex08_Member("apple","12345!","김사과",1000);
		System.out.println("m1=>"+m1);
		// => 생성자로 id, password 만 초기화
		Ex08_Member m2 = new Ex08_Member("banana","12345!");
		System.out.println("m2=>"+m2);	
		
		// => Scanner 로 입력받아 초기화 하기
		//    생성후, setter 로 초기화
		System.out.println("** Scanner 로 입력받아 초기화 하기 **");
		Ex08_Member m3 = new Ex08_Member();
		Scanner sc = new Scanner(System.in);
		System.out.println("** id 를 입력 하세요 =>");
		//m3.id = sc.nextLine(); // id 에 직접 접근 불가 => setter 이용
		m3.setId(sc.nextLine());
		System.out.println("** password 를 입력 하세요 =>");
		m3.setPassword(sc.nextLine());
		System.out.println("** Name 을 입력 하세요 =>");
		m3.setName(sc.nextLine());
		System.out.println("** Point 를 입력 하세요 =>");
		m3.setPoint(sc.nextInt());
		System.out.println("m3_1=>"+m3);	
		// => m3 의 point 를 2배로 하기 
		m3.setPoint(m3.getPoint()*2);          
		System.out.println("m3_2=>"+m3);	
		// => password 확인
		System.out.println("m3 password, admin => "+m3.getPassword("admin")); // 12345!
		System.out.println("m3 password, banan => "+m3.getPassword("banan")); // *****
		// => 지역변수 Test
		//    지역변수는 사용하기전에 반드시 초기화 해야함.
		int age = 100;
		System.out.println("** age => "+age);
	
	} //main
} //class
