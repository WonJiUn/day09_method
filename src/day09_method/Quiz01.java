package day09_method;

public class Quiz01 {
	
	public void compare(int num1, int num2){
		if(num1 >num2){
			print(num1);
		}
		else if(num1 <num2) {
			print(num2);
		}
		else {
			System.out.println("똑같은수");
		}
	}
	
	public void print(int num) {
		System.out.println("큰 수 : " + num);
	}
	
}
