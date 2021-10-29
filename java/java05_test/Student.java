package j05_test;
//** 실습 
//=> 완성 후 카톡으로 실행된 결과 화면 올려주세요  
//
//** Student 클래스 만들기 **
//1) private 필드 정의
//=> String 번호 sno, 이름 name
//     int  java, html, sum
//
//2) 생성자 1개
//=> 생성자로 번호, 이름, java, html 를 매개변수로 전달받아 초기화하고,
//    sum 에는 java+html 로 초기화
//
//3) setter/getter
//=> 클래스 외부에서 모든 필드의 값을 볼수 있지만, (getter Ok)
//   수정은 (setter No) 할 수 없다.
//
//4) toString  

public class Student {
	
	private String sno ;
	private String name ;
	private int java ;
	private int html ;
	private int sum ;
	
	public Student(String sno, String name, int java, int html) {
		this.sno=sno;
		this.name=name;
		this.java=java;
		this.html=html;
		this.sum=java+html;
	}

	public String getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	public int getJava() {
		return java;
	}
	public int getHtml() {
		return html;
	}
	public int getSum() {
		return sum;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", java=" + java + ", html=" + html + ", sum=" + sum + "]";
	}
} //class
