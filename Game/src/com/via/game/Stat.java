package com.via.game;

import java.util.ArrayList;

public class Stat {
	private int mLevel;
	private int mHP;
	private int mMP;
	
	private ArrayList<Object> mStat = new ArrayList<>();
	
	public Stat() {
		mLevel = 1;
		mHP = 100;
		mMP = 100;
		
		
		
		mStat.add(mLevel);
		mStat.add(mHP);
		mStat.add(mMP);
		
		System.out.println(mStat);
		
	}
	
	public void LevelUP() {
		mLevel += 1;
		mHP += 100;
		mMP += 100;
		System.out.println("������ �ö����ϴ�.");
		
	}
	
	public boolean useMP(int amount) {
		if (mMP < amount) {
			System.out.println("MP�� �����մϴ�");
			return false;
		}
		mMP -= amount;
		return true;
	}
	
}
