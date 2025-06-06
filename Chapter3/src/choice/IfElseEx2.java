package choice;

public class IfElseEx2 {

	public static void main(String[] args) {
		// 두 수의 크기 비교
		// 1. 조건 연산자 - (조건식) ? "참" : "거짓"
		int n1 = 10; //정수형 변수 n1에 10을 저장
		int n2 = 20;
		int max;
		
		// 연산 - 조건식의 결과는 true/false
		max = (n1 > n2) ? n1 : n2;
		
		System.out.println("두 수중 큰 수는 " + max + "입니다.");
		
		// 2. 조건문 - if ~ else문
		if(n1 > n2) {
			max = n1;
		}
		else { // else if(n1 < n2)
			max = n2;
		}
		
		System.out.println("두 수중 큰 수는 " + max + "입니다.");
	}

}
