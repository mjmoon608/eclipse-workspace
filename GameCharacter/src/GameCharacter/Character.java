package GameCharacter;

import java.util.Scanner;

//character -name - level -item -skills

public class Character {
	
	private String _name;
	private int _level;
	private int _hp;
	private int _mp;
	
	static Item item = new Item();
	static Skill skill = new Skill();

	public Character(String name) {
		_name = name;
		_level = 1;
		_hp = 100;
		_mp = 100;
		
	}
	
	public void show() {
		System.out.println("********************************************");
		System.out.println("�̸� : " + _name);
		System.out.println("���� : " + _level);
		System.out.println("HP : " + _hp);
		System.out.println("MP : " + _mp);
	}
	
	public void levelUp() {
		System.out.println("���� ���� ���ϵ帳�ϴ�!!");
		_hp += 100;
		_mp += 100;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("ĳ������ �̸��� �Է��ϼ��� : ");
		String input_name = input.nextLine();
		
		
		Character first = new Character(input_name);
		
		while(true) {
			System.out.print("\nĳ���� ����â: 1,  ������â : 2, ��ų â: 3  ->");
			int choice = input.nextInt();
			
			switch(choice) {
			case 1:
				first.show();
				break;
			case 2:
				item.show();
				System.out.print("������ ����: 1, ������ ������: 2   ->");
				int choice_item_step = input.nextInt();
				
				if (choice_item_step == 1) {
					input.nextLine();
					System.out.print("������ ������ �̸��� �Է��ϼ���: ");
					String itemName = input.nextLine();
					item.addItem(itemName);
					
				} else if(choice_item_step == 2) {
					input.nextLine();
					System.out.print("���� ������ �̸��� �Է��ϼ���: ");
					String itemName = input.nextLine();
					System.out.print("���� ������ �Է��ϼ���: ");
					int removeAmmount = input.nextInt();
					
					item.removeItem(itemName, removeAmmount);
				}
				
				break;
			case 3:
				skill.show();
				System.out.print("���ο� ��ų ����: 1, ���� ��ų ������: 2 ->");
				int choice_skill_step = input.nextInt();
				
				if (choice_skill_step == 1){
					input.nextLine();
					System.out.print("������ ��ų �̸��� �Է��ϼ���: ");
					String newSkill = input.nextLine();
					skill.addSkill(newSkill);
				} else if(choice_skill_step == 2) {
					input.nextLine();
					System.out.print("���� ���� ��ų �̸��� �Է��ϼ���: ");
					String levelUpSkill = input.nextLine();
					skill.powerUp(levelUpSkill);
				}
				break;
				
			}
			
			
		}
		
	}

}