package arrays;

public class ArrayInt {

	public static void main(String[] args) {
		// 배열 - 여러 개의 연속된 자료를 저장하는 자료구조이다.
		
//		int num1 = 10;
//		int num2 = 20;
//		int num3 = 30;
//		
//		System.out.println(num1 + ", " + num2 +  ", " +num3);
		
		
		// 배열의 길이가 4인 정수형 배열 선언
		int[] num1 = new int[4]; //int 자료형이기 때문에 전체 '0'으로 초기화 되어있음
		
		// 요소(값) 저장
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		num1[3] = 40;
		
		System.out.print("num1 : ");
		for(int i = 0; i < 4; i++) System.out.print(num1[i] + " ");
		System.out.println();
		
		
		// 배열의 크기(길이)
		System.out.println("num1 배열의 길이: " + num1.length);
		System.out.println();

		
		int[] num2 = {10, 20, 30, 40, 50, 60, 70}; //처음부터 초기화
		
		System.out.print("num2 : ");
		for(int i = 0; i < num2.length; i++) System.out.print(num2[i] + " ");
		System.out.println();
		
		System.out.println("num2 배열의 길이: " + num2.length);
	
		
		// 요소 수정
		System.out.println("====== num2의 값 수정 ======");
		num2[2] = 100;
		num2[4] = 200;
		
		System.out.print("num2 : ");
		for(int i = 0; i < num2.length; i++) System.out.print(num2[i] + " ");
		System.out.println();
		

		// 연산
		int total = 0;
		for(int i = 0; i < num2.length; i++) total += num2[i];
		System.out.println("num2의 전체 합계 : " + total);
		System.out.println("num2의 전체 평균 : " + ((double)total / num2.length));
		
		
		
	}

}
