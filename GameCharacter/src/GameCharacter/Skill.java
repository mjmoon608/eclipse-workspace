package GameCharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Skill {
	Map<String, Integer> characterSkill = new HashMap<String, Integer>();

	public Skill() {
		characterSkill.put("더블 점프", 0);
		characterSkill.put("체인 라이트닝", 0);
		characterSkill.put("블리자드", 0);
	}

	public void show() {
		System.out.println("********************************************");
		Set<Map.Entry<String, Integer>> allSkills = characterSkill.entrySet();

		for (Map.Entry<String, Integer> skill : allSkills) {
			System.out.print(skill.getKey() + " : ");
			System.out.println(skill.getValue() + " point");
		}
	}

	public void powerUp(String skillName) {
		if (characterSkill.containsKey(skillName) == false) {
			System.out.println(skillName + "이란 스킬은 습득한 적이 없습니다.");
		} else {
			int skillPoint = characterSkill.get(skillName);
			characterSkill.put(skillName, skillPoint + 1);
		}

	}

	public void addSkill(String skillName) {
		if (characterSkill.containsKey(skillName) == false) {
			characterSkill.put(skillName, 0);
		} else {
			System.out.println("이미 존재하는 스킬 입니다.");
		}

	}

}
