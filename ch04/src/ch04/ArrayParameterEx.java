package ch04;

public class ArrayParameterEx {

	
	public static void printCharArray(char a[]){
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			
		}
		System.out.println();
		
	}
	
	public static void changeChar(char a[]) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==' ')a[i]=',';
			
		}
	}
	public static void main(String[] args) {

		char c[]= {'T','H','I','S',' ','D','A','Y'};
		printCharArray(c);
		changeChar(c);
		printCharArray(c);
	}

}
