package day09_method;

import java.util.Scanner;

public class Quiz04Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("╪Ж ют╥б : ");
		num = sc.nextInt();
		
		Quiz04 q = new Quiz04();
		int cnt = q.repeat(num);
		q.print(num, cnt);
		
	}
}
