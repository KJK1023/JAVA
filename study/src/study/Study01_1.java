package study;

import java.util.Scanner; //scanner 사용시 필수 입력

public class Study01_1 {
	public static void main(String args[]) {
		System.out.println("이름, 도시, 나이, 체중, 결혼 여부를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();//문자열
		System.out.print("이름은"+name+", ");
		
		String city = scanner.next();//문자열
		System.out.print("도시는" + city +", ");
		
		int age = scanner.nextInt();//정수
		System.out.println("나이는"+age+("살, ")); //print와 println의 차이는 줄바꿈

		double weight = scanner.nextDouble(); //실수 
		System.out.print("체중은"+weight+"kg, ");
		
		boolean isSingle=scanner.nextBoolean(); //논리값  !true or false만 입력!
		System.out.println("결혼 여부는"+isSingle+"입니다 ");
		scanner.close();//scanner 객체 종료 명령어
	}

}
