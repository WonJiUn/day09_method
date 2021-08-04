package day09_method;

import java.util.Scanner;

public class Quiz06 {

	public int reverse(int num) {
		int temp = 0, result = 0;
		for(;;) {
			temp = num % 10;	
			num = num/10;		
			result = (result + temp) * 10;		
			if(num == 0) {
				return result/10;
			}
		}
		
	}
	public int scan() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("수 입력 : ");
		num = sc.nextInt();
		return num;
	}
	public void disp() {
		int num = scan();
		int result = reverse(num);
		System.out.println(num + "을 거꾸로 하면 " + result);
	}
	
	
	
	
	
}
