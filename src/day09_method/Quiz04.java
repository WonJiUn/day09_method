package day09_method;

public class Quiz04 {

	public int repeat(int num) {
		int cnt = 0;
		for(int i = 1; i<=num; i++) {
			if(num%i == 0)
				cnt++;
			
		}	
		return cnt;
	}
	
	
	public void print(int num, int cnt) {
		if(cnt == 2) {
			System.out.print(num + "�� �Ҽ��Դϴ�");
		}
		else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�");
		}
	}
	
}
