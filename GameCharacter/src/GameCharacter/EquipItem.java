package GameCharacter;

public class EquipItem extends Inventory{
	private int mSlotIdx = 0;
	private boolean mIsEqiopped = false;
	
	public EquipItem(String name, int itemCount, int slotIdx) {
		super(name, itemCount);
		mSlotIdx = slotIdx;
		
	}
}
