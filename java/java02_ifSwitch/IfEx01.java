package java02_ifSwitch;

import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) { 
	
	// ** 삼항식 → if문으로
	// → a, b 중 큰 수 출력하기
	
	//1
	int a = 100;
	int b = 60;
	int max = (a>b) ? a : b ;
	
	if(a>b) {
		max = a;
	}
	else {
		max=b;
	}
	
	//2
    boolean bool = (a>b) ? true : false ;
    
    if (a>b){
    	System.out.println("A는 B보다 크다 → True");
    }
    else {
    	System.out.println("A는 B보다 크다 → False");
    }
    
    //3
    char c = (a>b) ? '참' : 'F' ;
    if (a>b) {
    	System.out.println("a>b → 참");
    	}
    
    
    // 동일성 비교 == Test
    // c의 값이 '참'이면 출력한다.
    if (c=='참') System.out.println("c는 참이다"); //기본형 비교
    String t = "참";
    if (t.equals("참")) System.out.println("t는 참이다"); //참조형 비교
    
    //a와 b의 값이 같으면 (a+b) 결과 출력
    if (a==b) System.out.println("a+b →" + (a+b));
    
    
 // ** Scanner 로 근무시간을 입력받아 임금계산하기
    // => 조건 
    //    근무시간이 5시간 이하면 : 시간당 임금 10000원,
    //    근무시간이 6시간 이상이면 : 시간당 임금 9000원,
    
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("근무시간을 입력하세요 : ");
    int workTime = Integer.parseInt(sc.nextLine());
    double pay = 0;
    
//    if (workTime <= 5) {
//    	pay = workTime * 10000;
//    }
//    else {
//    	pay = workTime * 9000;
//    }
    
    //조건 추가 : 야간근무일 시 30% 추가수당
    System.out.println("** 야간근무이면 Y, 아니면 N을 입력하세요");
    String s = sc.nextLine();
    
    if (workTime > 6) {
    	if (s.equals("Y")) {
    		pay = (workTime * 10000) + (workTime * 10000)*0.3;
    	}
    	else {
    		pay = workTime * 10000;
    	}
    }
    else {
    	if(s.equals("Y")) {
    		pay = (workTime * 9000) + (workTime * 9000)*0.3;
    	}
    	else {
    		pay = workTime * 9000;
    	}
    }
    
    System.out.println("총 임금은 " + pay + "원 입니다");
    sc.close();    


	}//main
}//class
