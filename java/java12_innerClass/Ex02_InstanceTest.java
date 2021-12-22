package j12_innerClass;

// ** Outer , Inner 인스턴스 관계 Test
class OuterName {
	private String name;
	private int num=0;
	
	OuterName(String name) {
		this.name=name;
		System.out.println("** OuterName 생성자 **");
	} //생성자 
	public void whoAreU() {
		num++;
		System.out.printf("* whoAreU : name=%s, num=%d \n",name, num);
	}
	class InnerName {
		String name2;
		InnerName(String name2) {
			System.out.println("** InnerName 생성자 **");
			this.name2 = name2; // this 는 Inner 를 가리킴
			// => 변수명이 모두 name 으로 동일 하다면
			// => 매개변수로 전달받은 값을 Outer 의 변수에 넣어주려면 this 로는 불가능
			name = name2;
			whoAreU();
		} //InnerName 생성자 
	} //InnerName
} //OuterName

public class Ex02_InstanceTest {

	public static void main(String[] args) {
		// Outer 생성
		OuterName on1 = new OuterName("OUT1") ;
		OuterName on2 = new OuterName("OUT2") ;
		on1.whoAreU();
		on2.whoAreU();
		
		OuterName.InnerName in11 = on1.new InnerName("OUT1_In1") ;
		OuterName.InnerName in12 = on1.new InnerName("OUT1_In2") ;
		OuterName.InnerName in13 = on1.new InnerName("OUT1_In3") ;
		on1.whoAreU();
		
		OuterName.InnerName in21 = on2.new InnerName("OUT2_In1") ;
		OuterName.InnerName in22 = on2.new InnerName("OUT2_In2") ;
		on2.whoAreU();
		System.out.println("** After Out1 **");
		on1.whoAreU();
		
	} //main
} //class
