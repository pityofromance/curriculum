package j09_ABSinterface;

// ** interface 1
// => 상수, 추상메서드
// => static, default 메서드 (구현부가 있는 메서드, Java8 부터 추가됨)

public interface Ex02_MYinterface {
	// 상수만 가능 -> static final 은 생략가능
	//public static final int NUM = 100;
	int NUM = 8;
	// 추상메서드만 가능 -> public abstract 생략가능
	//public abstract int getNum();
	int getNum();
} // interface
