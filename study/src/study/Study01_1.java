package study;

import java.util.Scanner; //scanner ���� �ʼ� �Է�

public class Study01_1 {
	public static void main(String args[]) {
		System.out.println("�̸�, ����, ����, ü��, ��ȥ ���θ� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();//���ڿ�
		System.out.print("�̸���"+name+", ");
		
		String city = scanner.next();//���ڿ�
		System.out.print("���ô�" + city +", ");
		
		int age = scanner.nextInt();//����
		System.out.println("���̴�"+age+("��, ")); //print�� println�� ���̴� �ٹٲ�

		double weight = scanner.nextDouble(); //�Ǽ� 
		System.out.print("ü����"+weight+"kg, ");
		
		boolean isSingle=scanner.nextBoolean(); //����  !true or false�� �Է�!
		System.out.println("��ȥ ���δ�"+isSingle+"�Դϴ� ");
		scanner.close();//scanner ��ü ���� ��ɾ�
	}

}
