package ch03;

public class XX {

	public static void main(String[] args) {


		int i, k;
		
		for(i=1;i<10;i++){
			for(k=1;k<10;k++) {
				System.out.print(i+"*"+k+"="+i*k);
				System.out.print("\t");//하나씩 탭으로 띄기
		}
		System.out.println();//한 단어 끝나면 다음 줄로 커서 이동
	}
		
	}

}
