package ch4;

public class ArrayTest {

	public static void main(String[] args) {
		/*
		 * 실습 1
		 * 배열 길이가 5인 정수 배열을 선언하고, 1~10중 짝수만을 배열에 저장한 후
		 * 그 합과 평균을 계산하세요.
		 */
		
		//int[] arr = {2, 4, 6, 8, 10};
		
		int[] arr = new int[5];
		int j = 0;
		
		// 짝수만을 배열에 저장
		for(int n = 1; n <= 10; n++) {
			if(n % 2 == 0) {
				arr[j] = n;
				j++;
			}
		}
		
		// 합과 평균 계산
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
	
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + (double)(total / arr.length));
	} 

}
