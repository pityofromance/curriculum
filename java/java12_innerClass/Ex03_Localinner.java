package j12_innerClass;

//** LocalInner Class
//=> 메서드의 내부에 정의 되는 InnerClass.
//=> 메서드내에 정의되는 지역변수와 같다 (즉, 메서드내에서만 사용됨)
//=> static InnerClass는 허용 되지 않음
//   단, 상수는 허용

public class Ex03_Localinner {
	int a=100;
	
	Ex03_Localinner() { System.out.println("** Ex03_Localinner 생성자 **"); }
	
	public void innerTest(int n) {
		int b=200;
		final int C = n;
		// ** Local Inner Class 정의
		class Inner {
			static int d=400;  
			Inner() { System.out.println("** Inner 생성자 **"); }
			public void getData() {
				System.out.printf("** getData => a=%d, b=%d, c=%d, %d \n",a,b,C,d);
			} //getData
			public int adder() {
				d+=123;
				return d;
			}
		} // Inner_class
		// ** Local Inner Class 사용
		// => Local Inner Class 는 메서드내에서 지역변수 처럼 사용됨
		Inner in = new Inner();
		Inner.d = 500; // in.d = 500; 바람직하지 않음
		in.adder();
		in.getData();
	} //innerTest

	public static void main(String[] args) {
		// 생성 시점 확인
		// => Inner() 는 메서드 호출시 생성됨
		Ex03_Localinner ex03 = new Ex03_Localinner() ;
		ex03.innerTest(300);
		
		// ** Ex01_innerBasic 의 static 변수 Test
		System.out.println("* Outerclass.grade => "+Outerclass.grade);
		System.out.println("* Innerclass.country => "+Outerclass.Inner.country);

	} //main
} //class
