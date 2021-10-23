package j05_classMethod;

//** 자료의 속성을 저장 & 관리하는 클래스 연습
//=> 필드(속성)정의, 생성자, setter, getter, toString 메서드
//=> 자동완성 연습 

public class Ex08_Member {
	// ** 맴버(전역) 필드
	// => 외부클래스 에서 변수에 직접 접근하지 못하도록 하고, 
	//    메서드를 통해서만 접근하도록 함
	// => 그러면 변수에 값을 넣어주는 메서드 (설정자_mutator : Setter) 와
	//    변수의 값을 보여주는 메서드 (접근자_accessor, Getter) 가 필요함.
	private String id ;
	private String password ;
	private String name ;
	private int point ;
	
	// ** 맴버 메서드 (역할이 정해져 있는 메서드들)
	// => 생성자 메서드 : 주로 맴버변수 초기화 
	public Ex08_Member(String id, String password, String name, int point) {
		this.id=id;
		this.password=password;
		this.name=name;
		this.point=point;
	}
	public Ex08_Member(String id, String password) {
		this(id,password,null,0);
	} 
	public Ex08_Member() { }
	
	// => setter, getter : 맴버변수 write/read
	// => 메서드를 통해 접근하므로 변수값에 대한 Control 이 가능함
	// => 필요에 따라서 setter , getter 를 적절하게 작성해서 외부에서의 접근을 조정 할 수 있음
	//    id 초기화 이후에는 수정뷸가 ,  password 출력 예방....
	//    접근자(getter)만을 제공하면 자동적으로 읽기만 가능한 필드를 만들 수 있다.
	// => 형식:  void setXxxx(..) {~~~}
	public void setId(String id) {
		if (id==null) System.out.println("** ID 입력 오류 !! ***");
		else this.id=id;
	}
	public String getId() {
		return this.id;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword(String user) {
		if (user.equals("admin")) return this.password;
		else return "******" ;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setPoint(int point) {
		this.point=point;
	}
	public int getPoint() {
		return this.point;
	}
	// => toString : 맴버변수 값 출력
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", point=" + point + "]";
	}
} //class
