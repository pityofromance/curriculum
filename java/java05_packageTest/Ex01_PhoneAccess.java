package j05_packageTest;

import j05_classMethod.Phone;

public class Ex01_PhoneAccess {

	public static void main(String[] args) {
		// ** Phone Access Test
		// => private : 해당 클래스내부 에서만
		// => default : 같은 Package 내
		// => public : 모든 Class 접근 가능
		
		// ** 복습
		// => static 맴버 접근
		//System.out.println("Phone static맴버 접근 company="+Phone.company);
		// Error => company is not visible
		System.out.println("Phone static맴버 접근 PI="+Phone.PI);
		
		// => Phone 인스턴스 접근
		Phone p = new Phone("애플","Apple_20010101",150) ;
		// => 생성자도 접근범위가 적용됨
		//    그러므로 클래스의 인스턴스 생성 범위를 조정할 수 있음
		//    인스턴스를 남용하지 못하도록 조정할때 이용됨 
		p.showModelNo(); 
		// => public 로 정의된 인스턴스 맴버만 표시되고 접근가능함 
		
	} //main

} //class
