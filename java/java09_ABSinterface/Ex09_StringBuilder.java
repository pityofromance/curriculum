package j07_APITest;

//** StringBuilder
//=> StringBuffer 와 동일하나 동기화 키워드를 지원하지 않으므로 
//   "thread-safe" 하지않으나 단일쓰레드에서의 성능은 StringBuffer 보다 뛰어남.

public class Ex09_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sl = new StringBuilder("가나다");
		sl.append(123).append("ABCD").append(false);
		System.out.println("** sl before => "+sl);
		System.out.println("** sl.toString() => "+sl.toString());
		
		sl.insert(1,true);
		sl.insert(sl.length(), "END");
		System.out.println("** sl after => "+sl);
	} //main
} //class
