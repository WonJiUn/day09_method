package day09_method;

import java.util.Scanner;

public class Quiz03Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자입력 : ");
		num = sc.nextInt();
		
		Quiz03 q = new Quiz03();
		
		int re = q.calc(num);
		q.str(num, re);
		
		
		
		
		
	}
}
