package ch3;

public class Sum100 {

	public static void main(String[] args) {
		/* 실습 1
		 * 1부터 더했을때 그 합이 100이 넘는 자연수와 합계를 구하세요.
		 */
		int total = 0;
		int n = 1;
		while(true) {
			total += n;
			if(total > 100) break;
			n++;
		}
		
		System.out.println("n = " + n);
		System.out.println("sum = " + total);
		
	}

}
