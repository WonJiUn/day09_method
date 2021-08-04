package day09_method;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 int : 반환타입
		 test : 메소드 이름(사용자 지정)
		 int n : 매개변수(아규먼트)
		 return n : 돌려주고자 하는 값. 또는 해당 메소드를 종료할 때 사용
		 
		 public int test(int n){
		 	기능 코드 구현
		 	return n;
		 }
		 */
		Ex02Method ex = new Ex02Method();
		
		ex.test();
		
		String s = "aaa";	//맨앞글자 대문자 자료형은 일종의 클래스
							//컨트롤 누른상태로 마우스를 메소드에 갖다대고 첫번째 클릭하면 이동가능
		s.charAt(0);
		
	}
}
