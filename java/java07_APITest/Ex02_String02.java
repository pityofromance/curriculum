package j07_APITest;

//** String 2
// => String 의 메서드
// => 문자열 추출
//    charAt, length, indexOf, lastIndexOf, substring, trim
// => 메서드 적용시 변수의 값이 변경되는것이 아니고, 메서드가 적용결과를 return 할뿐.  

public class Ex02_String02 {

	public static void main(String[] args) {
		String name="홍길동" ;
		String city="~~~~~SeoulKorea~~eee";
		String country="01234I Love Korea   ";
		
		System.out.printf("* charAt => %s, %s \n",name.charAt(0), city.charAt(10));
		System.out.printf("* indexOf => %d, %d, %d \n",name.indexOf("김"), 
							city.indexOf("e",10),country.indexOf("o"));
		// 없으면 -1(음수) , indexOf("e",fromIndex) 특정index 이후부터적용가능, 여러개면 첫번째것 return
		System.out.printf("* indexOf => %d, %d \n",country.lastIndexOf("o"), city.lastIndexOf("e"));
		System.out.printf("* substring => %s, %s \n",country.substring(0,7), city.substring(12));
		// substring(0,7) : 인덱스 0 부터 7 이전까지 (0 부터 7개)
		
		System.out.printf("* trim => %s, %s \n",country.trim(), city.trim());
		// trim : 앞 뒤의 스페이스 제거 => 변수의 값이 변경되는것이 아님
		// 변경 적용 하려면
		country=country.trim();
		// ** 실습
		// 1) 아래 url 에서 화일명만 추출해서 출력하세요~~ 
		// 2) 아래 url 에서 화일의 확장자만 추출해서 출력하세요~~ 
		// 3) 위의 city, country 에서 "Korea" 만 추출해서 출력 해보세요
		String url="D:\\MTest\\MyWork\\Java01\\src\\j07_APITest.java";
		System.out.printf("* 1) 화일명만 => %s \n",url.substring(url.lastIndexOf("\\")+1,url.indexOf(".")));
		System.out.printf("* 2) 확장자만 => %s \n",url.substring(url.indexOf(".")+1));
		System.out.printf("* 3) Korea만 => %s, %s \n",
					country.substring(country.indexOf("K"),country.indexOf("a")+1),
					city.substring(city.indexOf("K"),city.indexOf("a")+1));
		
//		System.out.printf("파일명 추출하기 = %s \n",url.substring(url.indexOf("j"))); // 60
//		System.out.printf(">> substring => %s \n", url.substring(url.indexOf("S"),url.lastIndexOf("2")+1)); //90
//		System.out.printf("** 화일명 추출 => %s\n",url.substring(url.indexOf("E"), url.lastIndexOf("a")+1)); //80
//		System.out.printf(" 파일명 => %s\n ", url.substring(url.indexOf("E"), url.lastIndexOf("a")+1)); //80
		
	} //main

} //class
