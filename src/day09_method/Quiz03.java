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
			System.out.println(num + " : 3�� ����Դϴ�");
		}
		else {
			System.out.println(num + " : 3�� ����� �ƴմϴ�");
		}
	}
}
