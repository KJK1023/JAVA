import java.util.Scanner;
//import java.io;

public class inclass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.print("나뉨수를 입력");
			int dividend = scanner.nextInt();
			System.out.print("나눗수를 입력");
			int divisor = scanner.nextInt();
			
			try {
				System.out.println(dividend + "를" + divisor + "으로 나눈 값은" + dividend/divisor + "입니다");
				break;
			}
			catch(ArithmeticException e){
				System.out.println("0으로 나눌수 없습니다. 재입력하세요");
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
