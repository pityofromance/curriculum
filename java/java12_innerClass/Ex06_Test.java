package j12_innerClass;

//** 실습
//추상 메서드가 2개 있는 interface 를 정의하고 
//이를  main 메서드에서 익명 클래스를 이용해서 구현하고
//실행 시켜 보세요 ~~ 

interface RemoteControl {
	void turnOn();
	void turnOff();
}

public class Ex06_Test {

	public static void main(String[] args) {
		// ** 익명 클래스를 이용해서 구현하기
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println(" ~~ turnOn ~~");
			}
			@Override
			public void turnOff() {
				System.out.println(" ~~ turnOff ~~");
			}
		}; // 익명클래스 종료 반드시 ; 필요함.
		rc.turnOn();
		rc.turnOff();
	} //main
} //class
