package day09_method;

import java.util.Scanner;

public class Quiz02 {
	public void disp() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("�� �Է�");
		num = input.nextInt();
		String oddeven = oddeven(num);
		print(oddeven);
		
	}
	
	public String oddeven(int num){
		if(num % 2 == 0) {
			return "¦��";
			
		}
		else {
			return "Ȧ��";
			
		}
	}
	public void print(String result) {
		
		System.out.println(result);
	}
	
}
