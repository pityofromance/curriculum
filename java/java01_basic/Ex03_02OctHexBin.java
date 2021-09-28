package java01_basic;

//** 2진수, 8진수 , 16진수 표기
//=> 2진수 : 0b 로시작 → 0b1111
//=> 8진수 : 0
//=> 16진수: 0x

public class Ex03_02OctHexBin {

	public static void main(String[] args) {
		int bin = 0b1111; // 1+2+4+8=15
		int oct = 017; // 7+8=15
		int hex = 0xf; // 9, a(10) b(11), c(12), d(13), e(14), f(15), 10(16)
		System.out.println("** binary → " + bin);
		System.out.println("** oct → " + oct);
		System.out.println("** hex → " + hex);

		// → Integer를 각 2, 8, 16진법으로 출력하기
		System.out.println("** binary → " + Integer.toBinaryString(bin));
		System.out.println("** binary → " + Integer.toOctalString(oct));
		System.out.println("** binary → " + Integer.toHexString(hex));
		
		// → Integer to String
		//   문자열 연산에 연결되면 문자로 취급된다
		System.out.println("Integer to String1 → " + bin + oct + hex); // 결과: 151515
		System.out.println("Integer to String2 → " + (bin+oct+hex)); // 결과: 45
		
		// → String to Integer
		String s = "12345";
		System.out.println("String to Integer1 → " + (s+10)); // 결과 : 1234510
		System.out.println("String to Integer2 → " + (Integer.parseInt(s)+10)); //결과: 12355
		s = "123ABC";
		//System.out.println("String to Integer3 → " + (Integer.parseInt(s)+10)); // error
		//에러 코드 : java.lang.NumberFormatException : For input string : "123ABC"
		
		// → String to Double
		s = "123.4567";
		System.out.println("String to Double1 → " + (Double.parseDouble(s)+10)); //결과 : 133.4567
		s = "123.ABCD";
		System.out.println("String to Double2 → " + (Double.parseDouble(s)+10));
		//에러 코드 : java.lang.NumberFormatException

	} //main

} //class
