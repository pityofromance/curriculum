package j07_APITest;

import java.util.Arrays;

//** String 3
//=> String 의 메서드
//=> 문자열 변경
// 	-> toLowerCase, toUpperCase, replace, split
//	-> Type 변경: int to String, String to int 

public class Ex03_String03 {

	public static void main(String[] args) {
		// 1) 문자열 변경
		String name="홍길동" ;
		String city="~~~~~SeoulKorea~~eee";
		String country="     !I!Love!Korea!     ";
		
		System.out.printf("* toLowerCase => %s, %s \n",city.toLowerCase(), name.toLowerCase());
		System.out.printf("* toUpperCase => %s, %s \n",city.toUpperCase(), name.toUpperCase());
		System.out.printf("* 변수값 확인 => %s, %s \n",city, name);
		
		System.out.printf("* replace => %s, %s, %s \n",city.replace("e","Apple"),
						name.replace("홍","김"), country.replace("Korea","대한민국"));
		// 2) split
		// => 인자로 전달된 기호를 기준으로 잘라 배열에 담아줌
		String[] ss = country.split("!");
		System.out.println("* split 1 => "+Arrays.toString(ss));
		// => 양옆의 스페이스를 제거하고 처리하기
		ss=country.trim().split("!");
		System.out.println("* split 2 => "+Arrays.toString(ss));
		
		// 3) 형변환
		// => String <-> int
		// => String <-> double , float
		// 3.1) String -> int, double (Wrapper Class 이용)
		String num1 = "12345";
		String num2 = "100";
		//String num2 = "100abc"; // java.lang.NumberFormatException: For input string: "100abc"
		System.out.println("* String => "+ num1+num2); // 12345100
		System.out.println("* String => "+ (num1+num2)); // 12345100
		System.out.println("* String->int => "+ (Integer.parseInt(num1)+Integer.parseInt(num2))); // 12345+100
		num1="123.456";
		num2="200.005";
		System.out.println("* String->double => "+ (Double.parseDouble(num1)+Double.parseDouble(num2)));
		
		// 3.2) int, double..(숫자) -> String
		// => "" 즉, 문자열 연산에 연결되면 문자화됨
		int i=10 , j=30 ; 
		// => 연산순서 : 동일한 우선순위 -> 앞(왼)쪽부터
		//             높은 우선순위는 먼저 : *, /, % -> +, -  
		System.out.println(" 문자열1 연산 => "+i+j);  // 1030 
		//System.out.println(" 문자열1 연산 => "+i-j); => 문자열 연산은 + 만 허용됨
		System.out.println(" 문자열2 연산 => "+i*j);  // i*j 우선적용 => 300
		System.out.println(" 문자열3 연산 => "+(i+j)); // ( ) 우선적용 => 40
		System.out.println(i+j);
		//num1 = i ; => Type mismatch
		num2 = ""+i+j ;  // 1030 String
		num2 = i+j+"" ;  // 40 String
		System.out.println("****** num2 => "+num2 );  // String 1030
		System.out.println("****** int num2 => "+(Integer.parseInt(num2)+100));
		// => 기본 자료형의 값을 문자열로 바꾸기 : valueOf()
		//    모든 기본자료형 적용 가능 
		//    static String valueOf(boolean b)
		//    boolean, char, float, int, long ..
		double d = 1234.56789 ;
		//num1=d; => Type mismatch
		num1=String.valueOf(d);
		//num2=true; => Type mismatch
		num2="true" ; // => "true" boolean Type 과는 무관한 String 
		num2=String.valueOf(false); // 
		System.out.println("** num2 => "+num2);
		
		// 4) 비교 : compareTo
		// => 사전 순서로 비교 
		//    같으면 0, 이전이면 음수, 이후면 양수 return
		//    다른 글자 갯수를 표시함
		name="abc" ;
		System.out.println("* 비교1 => "+name.compareTo("abc")); // 0  : "abc" / "abc"
		System.out.println("* 비교2 => "+name.compareTo("ab"));  // 1  : "abc" / "ab"
		System.out.println("* 비교3 => "+name.compareTo("a"));   // 2  : "abc" / "a"
		System.out.println("* 비교4 => "+name.compareTo("bc"));  // -1  : "abc" / "bc"
		System.out.println("* 비교5 => "+name.compareTo("c"));   // -2  : "abc" / "c"
		System.out.println("* 비교6 => "+name.compareTo("abcabc"));  // -3 : "abc" / "abcabc"
		System.out.println("* 비교7 => "+name.compareTo("abcabcd")); // -4 : "abc" / "abcabcd"
		
		// 5) 포함확인
		System.out.println("* 포함확인 1 => "+country.contains("Korea")); //true
		System.out.println("* 포함확인 2 => "+country.contains("korea")); //false
		
	} //main

} //class
