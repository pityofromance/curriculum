package java02_ifSwitch;

//** switch - case - break 문
//1. => switch(key) 문의 인자로 사용 가능 Type ( int, char, String )
//2. => break : 무조건 탈출
//3. => case 블럭에는 { .... } 사용하지 않음


public class SwitchEx01 {

	public static void main(String[] args) {
		
		// **int형 test
		int i = 1;
		switch (i) {
		case 1: System.out.println("**1 입력**");
				System.out.println("**복문 test**");
				break;
		case 2: System.out.println("**2 입력**");
		case 3: System.out.println("**3 입력**");
		case 4: System.out.println("**4 입력**");
		default: System.out.println("** 입력 error **");
		} //switch

		// **char 형 test
		char jobCode = 'A';
		switch(jobCode) {
		case 'A' : System.out.println("**예술가**");
					if (i==1) {
						i++;
						System.out.println("** i++ -> " +i);
					}
					break;	
		case 'B' : System.out.println("**학생**"); break;
		case 'C' : System.out.println("**개발자**"); break;
		} //switch
		
		// **String형 test
		String color = "W";
		switch(color) {
		case "W" : System.out.println("**흰색**"); break;
		case "B" : System.out.println("**검정색**"); break;
		case "R" : System.out.println("**빨간색**"); break;
		default: System.out.println("**초록색**"); break;
		} //switch
		
		
		
	} //main

} //class
