package day09_method;

public class Quiz05 {
	public int ifelse(int num) {
		if(num < 0) {
			return -num;
		}
		else {
			return num;
		}
	}
	
	public void print(int num, int re) {
			System.out.println(num + "의 절대값 : " + re);
		
	}
	
}
