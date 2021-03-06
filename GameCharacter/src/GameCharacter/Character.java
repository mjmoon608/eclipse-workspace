package GameCharacter;

import java.util.Scanner;

//character -name - level -item -skills

// main에서 world에  new character를 만들고 각 character에서 item, skill에 접근

public class Character {
	
	private String _name;
	private int _level;
	private int _hp;
	private int _mp;
	
	static Inventory item = new Inventory("달팽이 껍질", 1);
	
	
	static Skill skill = new Skill();

	public Character(String name) {
		_name = name;
		_level = 1;
		_hp = 100;
		_mp = 100;
		
//		item.addItem("나뭇 가지");
//		item.addItem("허름한 투구");
		
	}
	
	public void show() {
		System.out.println("********************************************");
		System.out.println("이름 : " + _name);
		System.out.println("레벨 : " + _level);
		System.out.println("HP : " + _hp);
		System.out.println("MP : " + _mp);
	}
	
	public void levelUp() {
		System.out.println("레벨 업을 축하드립니다!!");
		_hp += 100;
		_mp += 100;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("캐릭터의 이름을 입력하세요 : ");
		String input_name = input.nextLine();
		
		
		Character first = new Character(input_name);
		
		while(true) {
			System.out.print("\n캐릭터 상태창: 1,  아이템창 : 2, 스킬 창: 3  ->");
			int choice = input.nextInt();
			
			switch(choice) {
			case 1:
				first.show();
				break;
			case 2:
				item.show();
				System.out.print("아이템 습득: 1, 아이템 버리기: 2   ->");
				int choice_item_step = input.nextInt();
				
				if (choice_item_step == 1) {
					input.nextLine();
					System.out.print("습득한 아이템 이름을 입력하세요: ");
					String itemName = input.nextLine();
					item.addItem(itemName);
					
				} else if(choice_item_step == 2) {
					input.nextLine();
					System.out.print("버릴 아이템 이름을 입력하세요: ");
					String itemName = input.nextLine();
					System.out.print("버릴 갯수를 입력하세요: ");
					int removeAmmount = input.nextInt();
					
					item.removeItem(itemName, removeAmmount);
				}
				
				break;
			case 3:
				skill.show();
				System.out.print("새로운 스킬 습득: 1, 기존 스킬 레벨업: 2 ->");
				int choice_skill_step = input.nextInt();
				
				if (choice_skill_step == 1){
					input.nextLine();
					System.out.print("습들할 스킬 이름을 입력하세요: ");
					String newSkill = input.nextLine();
					skill.addSkill(newSkill);
				} else if(choice_skill_step == 2) {
					input.nextLine();
					System.out.print("레벨 업할 스킬 이름을 입력하세요: ");
					String levelUpSkill = input.nextLine();
					skill.powerUp(levelUpSkill);
				}
				break;
				
			}
			
			
		}
		
	}

}
