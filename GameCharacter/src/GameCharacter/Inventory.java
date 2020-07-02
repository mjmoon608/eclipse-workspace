package GameCharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

 

public class Inventory {
	Map<String, Integer> characterItem = new HashMap<String, Integer>();
	
	
//	public Item() {
//		characterItem.put("나뭇 가지", 0);
//		characterItem.put("달팽이 껍질", 0);
//		characterItem.put("투구", 0);
//	}
	
	public Inventory(String name, int itemCount) {
		// TODO Auto-generated constructor stub
		characterItem.put(name, itemCount);
//		characterItem.put("달팽이 껍질", 0);
//		characterItem.put("투구", 0);
	}

	public void show() {
		System.out.println("********************************************");
		Set<Map.Entry<String, Integer>> allItems = characterItem.entrySet();
		
		for (Map.Entry<String, Integer> item : allItems) {
			System.out.print(item.getKey() + " : ");
			System.out.println(item.getValue() + "개");
		}
	}
	
	public void addItem(String itemName) {

		if (characterItem.containsKey(itemName) == false) {
			System.out.println("새로운 아이템을 습득하였습니다.");
			characterItem.put(itemName, 1);
		}else {
			int ammount = characterItem.get(itemName);
			characterItem.put(itemName, ammount+1);
		}

	}
	
	public void removeItem(String itemName, int removeAmmount) {
		if (characterItem.containsKey(itemName) == false) {
			System.out.println(itemName + " 해당 아이템은 인벤토리에 없습니다.");
		}else if(removeAmmount <= characterItem.get(itemName)){
			int ammount = characterItem.get(itemName);
			characterItem.put(itemName, ammount-removeAmmount);
		} else {
			System.out.print(itemName + "은  " + removeAmmount + "개 보다 적게 있습니다.");
		}

		
	}
	
}
