package com.via.game;

import java.util.ArrayList;
import java.util.Arrays;

public class CharacterManager {
	private ArrayList<Object> mCharacters = new ArrayList<>();
	
	private Stat mstat = new Stat();

	public CharacterManager(String worldName, String charactername) {
		// TODO Auto-generated constructor stub
		addCharacter(worldName, charactername);
		System.out.println(mCharacters);
		
		
	}
	
	public void addCharacter(String worldName, String characterName) {
		// TODO:: �̸� �ߺ� üũ -> clear
//		if (mCharacters.contains(characterName.toString())) {
//		if(Arrays.asList(mCharacters).contains(characterName)) {
		if(ArrayUtils.contains(mCharacters, characterName)) {
			System.out.println(characterName + "-> �̹� �����ϴ� ���̵� �Դϴ�.");
		} else {
			mCharacters.add(characterName);
			System.out.println(characterName + "-> ĳ���͸� �����߽��ϴ�.");
			int newUserIdx = mCharacters.indexOf(characterName);
			mCharacters.add(newUserIdx, Arrays.asList(mstat));

		}

	}
	
}
