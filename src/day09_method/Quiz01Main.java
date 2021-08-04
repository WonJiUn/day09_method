package day09_method;

import java.util.Scanner;

public class Quiz01Main {
	public static void main(String[] args) {
		
		Quiz01 q = new Quiz01();
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 두개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		q.compare(num1, num2);
		
	}
}
