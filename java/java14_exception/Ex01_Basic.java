package j14_exception;

//** 오류의 종류
//=> 컴파일(Compile) 오류 : 에디터 (이클립스) 에서 해결
//=> 런타임(RunTime) 오류 : 실행시 발생 오류  
//=> 논리적(Logical) 오류 : 디버거등 활용

//** Java 
//=> 예측가능한 RunTime 오류 정의 
//	-> 개발자가 대응 불가능 : 치명적 오류 (Error : 시스템, memory 관련 등) 
//	-> 개발자가 대응 가능 : 예외상황 (Exception : by zero, NullPointException...) 
//=> 실행 결과 의 오류 : 논리적 (Logical) 오류 -> 검증 및 테스트 (디버거 등 도구 활용)

//** Exception : 계층도 (ppt 12 ~ page)
//   Object -> Throwable -> Exception -> RuntimeException, IOException
//                       -> Error

//** Exception 에 적절하게 대응하도록 지원되는 구문
//=> try ~ catch  ~ finally ~
//=> 프로그램 작성 중 발생한 예외가
//   예상할 수 있는 범위에 있거나, 예외가 발생했을 때도
//   프로그램을 종료하지 않고 이후의 작업을 계속 진행하고자 할때.
//=> try 블럭을 진행 하다가 예외상황이 발생하면 catch 블럭으로 이동 
//   정상적으로 진행하면 catch 블럭 다음으로 이동
//   ( 비정상적 종료 예방 )  

public class Ex01_Basic {

	public static void main(String[] args) {
		
		int x=6;
		int y=3;
		int result=0; 
		String s = "12300"; // NumberFormatException
		String[] names= {"Apple","Banana","Green"};
		
		// ** 비교 
		// => Exception 처리 하지않은경우
		//    Exception 발생위치에서 비정상종료됨
		result = x/2;
		System.out.println("* result1 => "+result);
		
		// => Exception 처리
		//    Exception 발생시에도 정상진행 가능
		try {
			result = x/y;
			System.out.println("* result2 => "+result);
			System.out.println("* result3 => "+(result+=Integer.parseInt(s)));
			System.out.println("* 배열 Test => "+names[2]); // ArrayIndexOutOfBoundsException
			names = new String[2] ;  
			// 배열크기 음수지정 : NegativeArraySizeException -> 50행에서 catch Exception 블럭 으로 이동
			names[0] = "Grape";
			System.out.println("* 배열크기 Test => "+names[0]);
			s=null;
			System.out.println("* NullPointerException Test => "+s.length());
			
		}catch(ArithmeticException e) {
			System.out.println("* ArithmeticException => "+e.toString());
		}catch(NumberFormatException e) {
			System.out.println("* NumberFormatException => "+e.toString());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("* ArrayIndexOutOfBoundsException => "+e.toString());
		}catch(NullPointerException e) {
			System.out.println("* NullPointerException => "+e.toString());
		}catch(Exception e) {
			System.out.println("* Exception => "+e.toString());
		}finally {
			System.out.println("* finally => try or catch 무조건 실행 ");
		}//finally
		System.out.println("** 정상종료 !! 안녕히 가세요 ~~**");
	} //main

} //class
