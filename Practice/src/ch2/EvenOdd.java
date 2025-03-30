package ch2;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		/* 실습 2
		* 숫자를 입력받아 홀수/짝수를 판별하는 프로그램을 작성하세요
		*/		 
		Scanner numScanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = numScanner.nextInt();
		
		numScanner.close();
		
		String result;
		result = (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		System.out.println("입력한 " + num + "은(는) " + result);
	}

}
