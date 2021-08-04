package day09_method;

public class Quiz03 {
	public int calc(int num){
		if(num % 3 == 0) {
			return 0;
		}
		else {
			return 1;
		}
	}
	public void str(int num, int re) {
		if(re == 0) {
			System.out.println(num + " : 3의 배수입니다");
		}
		else {
			System.out.println(num + " : 3의 배수가 아닙니다");
		}
	}
}
