package j14_exception;

public class Ex04_MessageNaN {

	public static void main(String[] args) {
		
		String name="123" ; // "홍길동" -> "123"
		// ** 실수형 연산
		// => 0 나누기 연산 적용
		try {
			double d1 = 1.5/0.0 ; // Infinity : 무한수
			double d2 = 1.5%0.0 ; // NaN : Not a Number (숫자가 아님)
			if (Double.isInfinite(d1) || Double.isNaN(d2))
				 System.out.println("** Zero 연산은 허용하지 않습니다 **");
			else System.out.printf("** 실수형 연산 : d1=%f, d2=%f \n",d1,d2);
			
			int i = Integer.parseInt(name); // NumberFormatException
			name=null;
			i+=name.length();  // NullPointerException
			// => 해당되는 Exception 이 catch 블럭에 정의되어있지 않으면 비정상종료
			//    그러므로 안전한 대응을 위해  Exception 을 정의함
			
		} catch (NumberFormatException e) {
			System.out.println("* NumberFormatException => "+e.toString());
		} catch (Exception e) {
			System.out.println("* Exception  toString() => "+e.toString());
			System.out.println("* Exception  getMessage() => "+e.getMessage()); // Simple Message
			System.out.println("* Exception  printStackTrace() =>\n");
			e.printStackTrace();
			// => e.toString 을 포함한 순차적인 실행경로 등이 출력되어
			//    예외발생의 원인과 경로 파악에 도움. 
		}finally {
			System.out.println("** finally_무조건실행 **");
		}// try
		System.out.println("** Program 정상종료, GoodBye !!! **");
	} //main
} //class
