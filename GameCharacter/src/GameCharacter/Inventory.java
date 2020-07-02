package GameCharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

 

public class Inventory {
	Map<String, Integer> characterItem = new HashMap<String, Integer>();
	
	
//	public Item() {
//		characterItem.put("���� ����", 0);
//		characterItem.put("������ ����", 0);
//		characterItem.put("����", 0);
//	}
	
	public Inventory(String name, int itemCount) {
		// TODO Auto-generated constructor stub
		characterItem.put(name, itemCount);
//		characterItem.put("������ ����", 0);
//		characterItem.put("����", 0);
	}

	public void show() {
		System.out.println("********************************************");
		Set<Map.Entry<String, Integer>> allItems = characterItem.entrySet();
		
		for (Map.Entry<String, Integer> item : allItems) {
			System.out.print(item.getKey() + " : ");
			System.out.println(item.getValue() + "��");
		}
	}
	
	public void addItem(String itemName) {

		if (characterItem.containsKey(itemName) == false) {
			System.out.println("���ο� �������� �����Ͽ����ϴ�.");
			characterItem.put(itemName, 1);
		}else {
			int ammount = characterItem.get(itemName);
			characterItem.put(itemName, ammount+1);
		}

	}
	
	public void removeItem(String itemName, int removeAmmount) {
		if (characterItem.containsKey(itemName) == false) {
			System.out.println(itemName + " �ش� �������� �κ��丮�� �����ϴ�.");
		}else if(removeAmmount <= characterItem.get(itemName)){
			int ammount = characterItem.get(itemName);
			characterItem.put(itemName, ammount-removeAmmount);
		} else {
			System.out.print(itemName + "��  " + removeAmmount + "�� ���� ���� �ֽ��ϴ�.");
		}

		
	}
	
}
