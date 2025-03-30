package ch3;

import java.util.Scanner;

public class BankingSwitch {

	public static void main(String[] args) {
		/* 실습 2
		 * 예제로 만들었던 은행 업무 프로그램에서 아래의 개선사항을 구현하세요.
		 * 메뉴화면만들기:1.예금| 2.출금| 3.잔액조회| 4.종료
		 * 예금: 예금액을 입금하면 "정상처리, 현재잔액" 출력
		 * 출금: 예금액을 입금하면 "정상처리, 현재잔액" 출력
		 * 종료: 프로그램 종료
		 * 메뉴에없는번호선택: 메뉴를 잘못누름, 다시입력
		 * 
		 * 출금시에 잔고가 출금액보다 작은 경우를 처리하세요.
		 */
		
		int menu, total, money;
		boolean run = true;
		total = 0;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("================================");
			System.out.println("1.예금 | 2.출금 | 3.잔액조회 | 4.종료");
			System.out.println("================================");
			
			System.out.print("선택> ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: // 1. 예금
				System.out.print("예금액> ");
				money = scan.nextInt();
				total += money;
				System.out.println("정상입금 되었습니다. 현재 잔액 : " + total);
				break;
				
			case 2: //2. 출금
				System.out.print("출금액> ");
				money = scan.nextInt();
				if(money > total) {
					System.out.print("잔액이 부족합니다. 다시 입력해주세요. ");
				}
				else {
					total -= money;
					System.out.print("정상출금 되었습니다. ");
				}
				System.out.println("현재 잔액 : " + total);
				break;
				
			case 3: //3. 잔액조회
				System.out.println("잔액> " + total);
				break;
				
			case 4: //4. 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			
			default: 
				System.out.println("메뉴를 잘못 눌렀습니다. 다시 선택해 주세요.");
				break;
			}
			
		}
		
		scan.close();

	}

}
