package Prac;

import java.util.Scanner;


class CustomerList {
	String[] arrayCustomerList;
	

	
}


class CreateNewAccount {
	Scanner input = new Scanner(System.in);

	protected CreateNewAccount() {
		System.out.print("���¸� �Է��ϼ���(-�����ؼ� �Է��ϼ���): ");
		String newAccount = input.nextLine();
		System.out.print("���� �ܾ��� �Է��ϼ��� :");
		int newCurrnetBalance = input.nextInt();
	}
}


class WhatDo{
	
	public static boolean isDone = false;
	Scanner input = new Scanner(System.in);
	
	
	protected WhatDo() {
		System.out.println("�ȳ��ϼ���. ���°��� �ý����Դϴ�. �ʿ��Ͻ� �׸��� �������ּ���.");
		System.out.println(" 1: ���� �Է�, 2: �ܾ� ��ȸ, 3: �ܾ� �Ա�, 4: �ܾ� ���, 5: ����");
		int whatDo = input.nextInt();
		switch(whatDo) {
		case 1: // �����Է�
			System.out.println("�����Ը�");
			CreateNewAccount createNewAccount = new CreateNewAccount();
			
		case 2: // �ܾ� ��ȸ
			System.out.println("�ܾ���ȸ");
		case 3: // �ܾ� �Ա�
			System.out.println("�ܾ��Ա�");
		case 4: // �ܾ� ���
			System.out.println("�ܾ� ���");
		case 5: //����
			System.out.println("����");
			isDone = true;
		}	
	}
}




public class BankAccountPractice {
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		//������ ����
		WhatDo whatDo = new WhatDo();
		

		
		
		
		

	}

}