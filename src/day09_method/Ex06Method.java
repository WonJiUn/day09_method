package day09_method;

import java.util.Scanner;

public class Ex06Method {
	public void display() {			//return타입이 void면 대입연산자 사용불가
		Scanner input = new Scanner(System.in);
		int n1,n2;
		System.out.println("두 수 입력");
		n1 = input.nextInt();
		n2 = input.nextInt();
		int sum = test(n1,n2);
		printSum(n1,n2,sum);
	}
	public int test(int n, int n2) {
		return n + n2;
	}
	public void printSum(int n1, int n2, int s) {
		System.out.println(n1 + " + " + n2 + " = " + s);
	}
}
