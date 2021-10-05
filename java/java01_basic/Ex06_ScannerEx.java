package java01_basic;
import java.util.Scanner;

// ** System 클래스
//=> 표준입력, 표준출력 및 에러출력스트림, 외부적으로 정의된 프로퍼티 및
// 환경변수에의 액세스, 파일 및 라이브러리의 로딩 방법,
// 배열의 일부를 빠르게 카피하는 유틸리티 메서드 등이 있음.
//=> in      
// public static final InputStream  in  
// 키보드 입력 데이터를 공급하는 표준 입력 스트림    

//** Scanner 사용시 주의 사항
//=> nextInt() , nextLine() 사용시 주의
//  nextInt()는 개행문자 (\n) 가 뒤에 붙고, 숫자만 받아 처리한다. 
//  그래서 nextInt() 만 계속되면 문제가 없는데, 
//  뒤이어서 nextLine() 이 오면 앞 nextInt() 의 
//  남겨진 \n 을 한줄로 인식 받아 버린다.   
public class Ex06_ScannerEx {

	public static void main(String[] args) {
		// **실습 : 이름과 점수를 받아 출력하기
		// 1)입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("**이름을 입력하세요 : ");
		String name = sc.nextLine(); //입력값을 제공
		System.out.println("**점수를 입력하세요: ");
		//int score = sc.nextInt();
		int score = Integer.parseInt(sc.nextLine());
		//-> parseInt에 전달되는 string type의 값이 숫자가 아니면 오류
		//2.출력하기
		System.out.println("**이름 : "+name);
		System.out.println("**점수 : "+score);
		sc.close();
	} //main

} //class	
