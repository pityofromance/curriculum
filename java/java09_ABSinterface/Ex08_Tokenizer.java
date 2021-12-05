package j07_APITest;

import java.util.StringTokenizer;

// ** StringTockenizer
// => 문자열을 토큰으로 구분

public class Ex08_Tokenizer {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("AM:11:53:45",":") ;
		
		while (st.hasMoreTokens()) {
			System.out.println( st.nextToken());
		}
		// 둘 이상의 구분자, 공백도 구분자에 포함 가능
		st = new StringTokenizer("1 2+3 4-5*6/7","+-*/ ") ;
		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken()+" ");
		}

	} //main
} //class
 