package q02;

public class Xxx {
		//���������� public . Ŭ�������� ǥ���ϴ� Ű���� class. Ŭ�����̸��� Xxx (ù �빮�� ����. �ش� �����̸��� Xxx.java �� �Ȱ��ƾ� �� ����)
		
		// �̰� �ڹ��� �Լ���. ��� �Լ� ����. ��, �� main �Լ��� Ư�� �Լ���.
		// �� main �Լ����� �ڵ� ���� �帧�� ���۵�.
		// �� Ű������� �ϴ� �����Ͻð� �׳� �����ؼ� ���ų� main �̶�� Ÿ���� �ϰ� ctrl + space �ϸ� vsc ���� ���ó�� �ڵ� �ڵ��ϼ��Ǵ� �̰� �̿��Ͻÿ�.
		
//		mainġ�� ctrl + space
		
		public static void main(String[] args) {
			
			Cat cat1 = new Cat();	// ��ü ����. js �� ���� �Ȱ���?		
			Cat cat2 = new Cat();			
			Cat cat3 = new Cat();	
			
			cat1.info();//��ü�� run �Լ� ����. ��...
			
			cat2.name = "ŰƼ";
			cat2.age = 10;
			
			cat2.info();

	}
}
