package day09_method;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 int : ��ȯŸ��
		 test : �޼ҵ� �̸�(����� ����)
		 int n : �Ű�����(�ƱԸ�Ʈ)
		 return n : �����ְ��� �ϴ� ��. �Ǵ� �ش� �޼ҵ带 ������ �� ���
		 
		 public int test(int n){
		 	��� �ڵ� ����
		 	return n;
		 }
		 */
		Ex02Method ex = new Ex02Method();
		
		ex.test();
		
		String s = "aaa";	//�Ǿձ��� �빮�� �ڷ����� ������ Ŭ����
							//��Ʈ�� �������·� ���콺�� �޼ҵ忡 ���ٴ�� ù��° Ŭ���ϸ� �̵�����
		s.charAt(0);
		
	}
}
