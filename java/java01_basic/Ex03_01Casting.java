package java01_basic;


// ** Type Casting (형변환)
// 1. 자동 (프로모션 promotion, 확대형변환)
// 	 → 큰 자료형에 작은 자료형을 대입하면 : 자동으로 이루어짐
// 2. 강제 (디모션, demotion, 축소형변환)
//   → 작은 자료형에 큰 자료형을 대입 : 자동으로 이루어지지 않음

public class Ex03_01Casting {

	public static void main(String[] args) {
		// 1.프로모션
		double d = 123.45; //8byte
		int i = 123; //4byte
		d = i; //프로모션
		System.out.println("** 프로모션 후 i => " + i);
		System.out.println("** 프로모션 후 d => " + d);
		
		// 2.디모션
		//   → 같은 Type 의 경우에도 받는 쪽이 크기가 다를 때
		//   → Type이 다를 때
		char c = 'B' ; // 2byte
		System.out.println("char c => " + c + ", " + (int)c );
		i = c+1; //프로모션 : B1 아니고 산술연산 적용됨
		System.out.println("int i => " + i + ", " + (char)i );
		// 디모션 (4byte → 2byte, Type casting 형변환)
		// ASCII Code 참고
		
		float f = 123.45f; // 4byte
		int n = 100; //4byte
		//n=f; //Type mismatch → 디모션(형변환)이 필요함
		n = (int)f;
		System.out.println("int n → " + n); //n=123
		f = n;
		System.out.println("float f → " + f); //f=123.0
		
		// 3.정수형 연산
		// → 4byte 이하 type의 정수형 연산의 경우 무조건 그 결과는 int(4byte)로 처리
		short s1 = 10, s2=20, s3=0;
		//s3 = s1 + s2; // Type mismatch from int to short 가 될 수 없다
		s3 = (short)(s1+s2);
		
		// 4. by 0 ERROR , 오버플로우 / 언더플로우
		// 4.1) 정수형
		//   → 컴파일 오류 없음
		//   → 실행(런타임)오류 : java.lang.ArithmeticException : / by zero
		System.out.println("** 정수형 by 0 Test1 나누기 연산 → " + (n/10) ); //error
		System.out.println("** 정수형 by 0 Test2 나머지 연산 → " + (n%10) ); //error
		
		// 4.2) 실수형
		//   → 컴파일, 런타임 오류 없음
		f = 123.567f;
		System.out.println("** 실수형 by 0 Test1 나누기 연산 → " + (f/0) ); 
		// Infinity(무한수) → 오버플로우
		System.out.println("** 실수형 by 0 Test2 나머지 연산 → " + (f%0) ); 
		// NaN (Not a Number) → 언더플로우
		
		// 4.3) 정수형 연산의 오버플로우 / 언더플로우
		// → Exception 발생하지 않음 주의
		short sMax = Short.MAX_VALUE;
		short sMin = Short.MIN_VALUE;
		System.out.println("** sMax → " + sMax + ", sMax+1 → " + (sMax+1)); //정상적 int연산
		System.out.println("** short → " + sMax + ", sMax+1 → " + (short)(sMax+1)); // 오버플로우 → 최소값과 동일 
		// 최대값의 2진 표현 : 1111 1111 1111 1111 + 1 → 1 0000 0000 0000 0000
		System.out.println("** sMin → " + sMin + ", sMin-1 → " + (sMin-1)); //정상적 int 연산
		System.out.println("** short → " + sMin + ", sMin-1 → " + (short)(sMin-1)); // 언더플로우 → 최대값과 동일
		
	} //main

} //class
