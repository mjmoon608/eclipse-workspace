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
		// ����� �Է� �޾Ƽ� ĳ���� �̸� �ޱ�. mCharacterName
		Scanner userInput = new Scanner(System.in);
//		String mCharacterName = "Minjong";
		String mCharacterName = userInput.nextLine();
		
		CharacterManager characterManager = new CharacterManager(mWorldName,mCharacterName);
		
		


	}



}

//�߰�,���� �Ŵ��� Ŭ���� ����
//����: {
//ĳ���� : {
//	����â : {
//	},
//	�κ��丮:{
//	},
//	��ųâ: {
//	},
//	���â: {
//	}
//}
//}
