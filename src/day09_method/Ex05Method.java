package day09_method;

public class Ex05Method {
	
	public int sumFunc(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public void test(int n) {
		if(n == 1) {
			System.out.println();
		}
		else {
			System.out.println("else");
			return;							//해당 메소드를 종료하는 기능도 있음
		}
		System.out.println("test 메소드 종료");
	}
	
	public String test02() {
		int num =1;
		if(num == 1) {
			return "안녕하세요";					//return 뒤에 오는 데이터의 자료형과 String은 일치해야함
		} //void가 아닐때, if문이 거짓이라 실행이 안될경우 return 값이 없게 되므로 return null이 없으면 오류발생
		return null;
	}
		
	
	
	
}
