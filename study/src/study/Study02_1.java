package study;
import java.util.Scanner;

public class Study02_1 {

	public static void main(String[] args) {
		int count=0; 
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
		
		int n = scanner.nextInt();
		while(n != 0) {
			sum += n;
			count++;	
			n=scanner.nextInt();
		}
		if(count==0)System.out.printf("입력된 정수가 없습니다.");
		else {
			System.out.println("입력된 정수의 개수는"+count+"입니다");
			System.out.println("평균은"+sum/count+"입니다");	
		}
		scanner.close();

	}

}
