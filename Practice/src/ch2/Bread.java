package ch2;

public class Bread {

	public static void main(String[] args) {
		/* 실습 1
		* 빵 25개를 4명이 나눠가질 경우, 각자의 몫과 남은 빵의 개수를 구하시오
		*/
		int bread = 25;
		int number = 4;
		System.out.println("각자의 몫 :"+ (bread / number) + "개, 남은 빵 : " + (bread % number) + "개");
		System.out.println();

	}

}