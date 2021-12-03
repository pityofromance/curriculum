package j09_ABSinterface;

//** 추상클래스 와 intertrace 의 활용 
//=> 일반적인 경우 사례
//=> 실무에서는 interface 가 많이 사용되고 (다중구현의 장점) ,  
//   API 의 계층도에서는 추상클래스도 많이 이용됨 

//** 과제
//=> 게시판을 종류별로 10개 이상 만든다고 가정.
//=> 기본 기능 (interface) : insert, update, delete, listPrint, detail, replyInsert
//=> 게시판 종류별로 : 일반게시판(i,u,d,l,detail,r), QnA(i,r,l), 공지사항(i,l,detail)
//=> 모든 게시판은 interface 를 구현해야한다면
//   게시판 종류에 따라 필요없는 메서드도 오버라이딩 해야함.
//   이런 경우 interface 를 구현하는 추상 클래스를 작성하고
//   게시판은 이 추상클래스를 구현한다면 의무적 구현에서 벗어나 필요한 메서드만 구현 할 수 있음.

// ** 추상메서드만
interface Boardi {
	void insert();
	void update();
	void delete();
	void listPrint();
	void detail();
	void replyInsert();
}
// ** 추상클래스 : 일반메서드, 추상메서드 
// => 의무구현 메서드는 추상메서드로 두고, 선택적 구현메서드 들은 미리 구현해놓음
//    그러므로 구현 클래스들의 의무구현 코드를 줄여줌
// => 추상 클래스는 추상메서드를 포함 할 수 있으므로 
//    interface 의 추상메서드를 구현 하지 않아도 됨.
abstract  class BoardA  implements Boardi {
	//public void insert() { }
	//public void listPrint(){ }
	public void update(){ }
	public void delete(){ }
	public void detail(){ }
	public void replyInsert(){ }
}
// ** interface 를 직접 implements -> 모두 의무 구현
class MemberB  implements Boardi {
	@Override
	public void insert() { System.out.println(" MemberB insert"); }
	@Override
	public void update() { System.out.println(" MemberB update"); }
	@Override
	public void delete() { System.out.println(" MemberB delete"); }
	@Override
	public void listPrint() { System.out.println(" MemberB listPrint"); }
	@Override
	public void detail() { System.out.println(" MemberB detail"); }
	@Override
	public void replyInsert() { System.out.println(" MemberB replyInsert"); }
} //MemberB 

//** interface 를 직접 implements -> 모두 의무 구현
class NoticeB implements Boardi {
	@Override
	public void insert() {System.out.println(" MemberB insert");}
	@Override
	public void listPrint() {System.out.println(" MemberB listPrint");}
	@Override
	public void detail() {System.out.println(" MemberB detail");}
	
	// 필요없는 메서드도 의무적으로 구현해야함
	@Override
	public void delete() { }
	@Override
	public void replyInsert() { }
	@Override
	public void update() { }
} //NoticeB

// ** 선택적 구현 가능
// => interface 를 구현한 추상클래스를 상속받음으로 
//    interface 를 직접 구현 하지 않고 추상클래스를 상속받음으로 필요한 메서드만 구현 가능
class QnAB  extends BoardA {
	@Override
	public void insert() { System.out.println(" QnAB insert"); }
	@Override
	public void listPrint() { System.out.println(" QnAB listPrint"); }
	@Override
	public void replyInsert() { System.out.println(" QnAB replyInsert"); }
} //QnAB 

public class Ex05_AbsInter {

	public static void main(String[] args) {
		// 1) 클래스 직접 생성 
		MemberB b1 = new MemberB();
		b1.insert();
		b1.update();
		b1.delete();
		b1.listPrint();

		// 2) 인터페이스로 생성 -> 다형성 적용 	
		Boardi b2 = new QnAB();  // new MemberB() / new QnAB()
		b2.insert();
		b2.listPrint();
		b2.detail();
		
		b2=new MemberB();
		b2.insert();
		b2.listPrint();
		b2.detail();
		
		b2=new NoticeB();
		b2.insert();
		b2.listPrint();
		b2.detail();
	} //main

} //class
