package Prac;

import java.util.Scanner;


class CustomerList {
	String[] arrayCustomerList;
	

	
}


class CreateNewAccount {
	Scanner input = new Scanner(System.in);

	protected CreateNewAccount() {
		System.out.print("계좌를 입력하세요(-포함해서 입력하세요): ");
		String newAccount = input.nextLine();
		System.out.print("현재 잔액을 입력하세요 :");
		int newCurrnetBalance = input.nextInt();
	}
}


class WhatDo{
	
	public static boolean isDone = false;
	Scanner input = new Scanner(System.in);
	
	
	protected WhatDo() {
		System.out.println("안녕하세요. 계좌관리 시스템입니다. 필요하신 항목을 선택해주세요.");
		System.out.println(" 1: 계좌 입력, 2: 잔액 조회, 3: 잔액 입금, 4: 잔액 출금, 5: 종료");
		int whatDo = input.nextInt();
		switch(whatDo) {
		case 1: // 계좌입력
			System.out.println("계좌입릭");
			CreateNewAccount createNewAccount = new CreateNewAccount();
			
		case 2: // 잔액 조회
			System.out.println("잔액조회");
		case 3: // 잔액 입금
			System.out.println("잔액입금");
		case 4: // 잔액 출금
			System.out.println("잔액 출금");
		case 5: //종료
			System.out.println("종료");
			isDone = true;
		}	
	}
}




public class BankAccountPractice {
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		//무엇을 할지
		WhatDo whatDo = new WhatDo();
		

		
		
		
		

	}

}
