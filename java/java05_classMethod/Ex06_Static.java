package j05_classMethod;

// ** static 
// => 사전적 : (변화움직임이 없이) 고정된, 고정적인, 정지 상태의
// => Java : 메모리에 고정된다는 의미 ( 실행 -> 사용 -> 종료 )
// => 맴버들에 적용 : 맴버변수, 맴버메서드
// => static : 클래스종속 <-> non_static : 인스턴스종속

//** static (클래스종속) 
//=> 클래스변수(모든 인스턴스가 공유) , 클래스메서드

//** non_static (인스턴스종속)
//=> 인스턴스변수(인스턴스별로 관리) , 인스턴스메서드

// ** 4칙연산 계산기 
public class Ex06_Static {
	// ** 맴버(전역,Global) 변수
	int result;
	static int total;
	
	// non_static 메서드 => static, non_static 모두 접근가능
	public int add(int i, int j) {
		int total=0; // 지역변수로 동명의 변수 사용가능
		// static int aaa; => 맴버변수만 가능 
		//result=i+j;
		this.total=i+j;  //  this 가 인스턴스를 의미하기 때문에 바람직하지않은 접근
		System.out.println("** add total => "+Ex06_Static.total); //바람직한 접근
		return i+j;
	}
	// static 메서드 => static 만 접근가능
	public static int min(int i, int j) {
		// static int aaa; // 지역변수에는 static 적용안됨
		//result=i-j;  // 인스턴스 없이는 사용불가
		total=i-j;
		return i-j;
	}
	// ** 메서드 호출
	//* non_static 메서드 
	//=> static, non_static 메서드 모두 인스턴스없이 호출가능
	public int mul(int i, int j) {
		add(i,j);
		min(i,j);
		return i*j ;
	}
	//* static 메서드 
	//=> static 메서드만 인스턴스없이 호출가능
	//=> non_static 메서드를 호출 하려면 인스턴스가 필요함
	public static double div(int i, int j, Ex06_Static ex06) {
		//add(i,j); // 오류
		ex06.add(i,j); // 가능
		min(i,j);
		return i/j ;
	}
	
	public static void main(String[] args) {
		//** static 변수, 메서드 Test 
		// => 인스턴스없이 호출가능, 그러므로 클래스 메서드 라고함
		total=1000;
		System.out.println("* statictotal 1 => "+Ex06_Static.total);
		System.out.println("* statictotal 2 => "+total);
		System.out.println("* static min => "+min(5,2));
		System.out.println("* static div => "+div(5, 2, new Ex06_Static()));
		
		//** non_static 변수, 메서드 Test
		// => 인스턴스를 통해 접근 가능
		Ex06_Static s = new Ex06_Static();
		s.result=12345;
		System.out.println("* non_S result1 => "+ s.result);
		System.out.println("* non_S add => "+ s.add(6,2));
		//System.out.println("* non_S mul => "+ s.mul(6,2));
		System.out.println("* after total => "+total); 
		
		Ex06_Static ss = new Ex06_Static();
		ss.result=5000;
		// result 값 비교
		System.out.println("* non_SS result => "+ ss.result);
		System.out.println("* non_S result2 => "+ s.result);
		// total 값 비교
		System.out.println("* non_SS add => "+ ss.add(7,3));
		System.out.println("* after total => "+total); 
		
		// => 인스턴스를 통해 static 접근
		//    컴파일오류는 아니지만 바람직하지 않음 
		//System.out.println("* s statictotal => "+s.total);
		//System.out.println("* s static min => "+s.min(5,2));
		//System.out.println("* s static min => "+s.div(5, 2, new Ex06_Static()));
		
	} //main

} //class
