package loop;

public class NestedFor {

	public static void main(String[] args) {
		// 중첩 for 문 - 반복문 내부에 반복문이 사용됨
		// 행, 열로 표현
		
		// 구구단
		for(int i =2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
		
		// 별 찍기
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/* 
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****
		 */
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

}
