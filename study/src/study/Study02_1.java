package study;
import java.util.Scanner;

public class Study02_1 {

	public static void main(String[] args) {
		int count=0; 
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���");
		
		int n = scanner.nextInt();
		while(n != 0) {
			sum += n;
			count++;	
			n=scanner.nextInt();
		}
		if(count==0)System.out.printf("�Էµ� ������ �����ϴ�.");
		else {
			System.out.println("�Էµ� ������ ������"+count+"�Դϴ�");
			System.out.println("�����"+sum/count+"�Դϴ�");	
		}
		scanner.close();

	}

}
