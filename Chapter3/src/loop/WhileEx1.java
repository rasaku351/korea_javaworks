package loop;

public class WhileEx1 {

	public static void main(String[] args) {
		// 반복문 - 초기값, 종료값, 증감값
		int n = 1; //초기값
		while(n <= 10) {
			System.out.println("Hello~" + n);
			n++;
		}
		
		// 1~10까지의 합계
		int sum = 0; //합계를 저장할 변수 sum 선언
		double avg; //실수형 변수 avg 선언
		
		n = 1;
		while(n <= 10) {
			sum += n;
			n++;
		}
		avg = (double)sum / (n-1);
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

}
