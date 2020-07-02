package com.via.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class World {
	private String mWorldName;


	private static int _HP = 100;
	private static int _MP = 100;
	private static int _LEVEL = 1;

	int[] startStatus = { _LEVEL, _HP, _MP };

	private ArrayList<Object> mCharacterStatus = new ArrayList<>();


	public World(String worldName) {
		mWorldName = worldName;
		// 사용자 입력 받아서 캐릭터 이름 받기. mCharacterName
		Scanner userInput = new Scanner(System.in);
//		String mCharacterName = "Minjong";
		String mCharacterName = userInput.nextLine();
		
		CharacterManager characterManager = new CharacterManager(mWorldName,mCharacterName);
		
		


	}



}

//추가,생성 매니져 클래스 생성
//월드: {
//캐릭터 : {
//	상태창 : {
//	},
//	인벤토리:{
//	},
//	스킬창: {
//	},
//	장비창: {
//	}
//}
//}
