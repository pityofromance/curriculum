package java04_array;

import java.util.Arrays;

public class Ex02_ArrayType {

	public static void main(String[] args) {
		// 타입별로 배열을 정의 하고 출력해본다. (묵시적 정의)
		// => float , char, String
		// => data 갯수는 5개
		// 1) float
		float[] weight = {22.3f, 33.5f, 44.55f, 55.66f, 66.7f } ;
//		for (float f:weight) {
//			System.out.println("* float => "+f);
//		}
		System.out.println("* float => "+Arrays.toString(weight));
		
		// ** Wrapper Class
		// => 기본자료형을 지원해주는 클래스
		//    Integer.parseInt("1234") -> int 123
		//    Float , Double, Character, Byte, Short ...
		// => 배열 : Arrays
		
		// 2) char
		char[] grade = {'A','B','C','D','E'};
//		for (char c:grade) {
//			System.out.print(c+"\t");
//		}
//		System.out.println("");
		System.out.println("* char => "+Arrays.toString(grade));
		// 3) String
		String[] city = {"서울","성남","뉴욕","파리","용인"}; 
//		for (String s:city) {
//			System.out.print(s+"\t");
//		}
//		System.out.println("");
		System.out.println("* String => "+Arrays.toString(city));
	} //main
} //class
