import java.util.Scanner;
//import java.io;

public class inclass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.print("�������� �Է�");
			int dividend = scanner.nextInt();
			System.out.print("�������� �Է�");
			int divisor = scanner.nextInt();
			
			try {
				System.out.println(dividend + "��" + divisor + "���� ���� ����" + dividend/divisor + "�Դϴ�");
				break;
			}
			catch(ArithmeticException e){
				System.out.println("0���� ������ �����ϴ�. ���Է��ϼ���");
			}
			/*catch(IOException e) {
				System.out.println("IOException");
			}*/
			finally {
				System.out.println("OK");		
			}

		}
		scanner.close();
	}
}
