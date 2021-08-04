package day09_method;

import java.util.Scanner;

public class Quiz05Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("╪Ж ют╥б : ");
		num = sc.nextInt();
		
		Quiz05 q = new Quiz05();
		
		int re = q.ifelse(num);
		q.print(num, re);
		
		
	}
}
