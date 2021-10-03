package java01_basic;

public class Ex05_PrintEx02 {

	public static void main(String[] args) {
		float f1 = .10f;   // 0.10, 1.0e-1  => 1*10의-1승=> 1*1/10 
		float f2 = 1e1f;   //1*10의1승 : 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f; // 3.14*1000 => 3140 
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); 
		// 실수표현 : %f(일반적), %e(지수형식), %g(간단형) 
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2); 
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);

		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리
		
		String url = "www.codechobo.com";
		System.out.printf("[%.8s]%n", url);  // 왼쪽에서 8글자만 출력
		
		
		
		
	} // main
} //class
