package ch03;

import java.util.Scanner;

public class word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			text=scanner.nextLine();
			if(text.equals("exit"))break;
			System.out.println(text);
			
		}
		scanner.close();
	}

}
