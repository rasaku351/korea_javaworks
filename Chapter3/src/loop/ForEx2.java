package loop;

public class ForEx2 {

	public static void main(String[] args) {
		// 문자 세트 - 아스키 코드, 유니코드
		char ch;
		for (ch = 65; ch < 123; ch++) { // 65 = 'A', 123 = 'Z'
			System.out.print(ch + " ");
		}
		System.out.println();
		
		// 한글 출력 - 유니코드
		for(ch = 12593; ch < 12686; ch++) { // 12593 = 'ㄱ'
			System.out.print(ch + " ");
		}
		System.out.println();
		
		// 구구단 출력
		int dan = 6;
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}

}
