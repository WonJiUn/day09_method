package day09_method;

public class Ex05Method {
	
	public int sumFunc(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public void test(int n) {
		if(n == 1) {
			System.out.println();
		}
		else {
			System.out.println("else");
			return;							//�ش� �޼ҵ带 �����ϴ� ��ɵ� ����
		}
		System.out.println("test �޼ҵ� ����");
	}
	
	public String test02() {
		int num =1;
		if(num == 1) {
			return "�ȳ��ϼ���";					//return �ڿ� ���� �������� �ڷ����� String�� ��ġ�ؾ���
		} //void�� �ƴҶ�, if���� �����̶� ������ �ȵɰ�� return ���� ���� �ǹǷ� return null�� ������ �����߻�
		return null;
	}
		
	
	
	
}
