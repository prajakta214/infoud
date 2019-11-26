package com.infoud.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharRepetation {

	public void findOccurance(String string1) {
		char[] str1 = string1.toCharArray();
		int count = 1;
		for (int i = 0; i < string1.length() - 1; i++) {
			int asc = str1[i];
			for (int j = 0; j < string1.length() - 1; j++) {
				int asc2 = str1[j];
				if (asc == asc2) {
					count++;
				}
			}
			System.out.println("Occurence of " + str1[i] + " is:\t" + count);
			count = 0;
		}

	}

	public Map<Character, Integer> findCharacter(String string1) {
		int count = 1;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < string1.length(); i++) {
			char x = string1.charAt(i);

			if (!map.containsKey(x)) {
				map.put(x, 1);

			} else {
				count = map.get(x);
				count++;
				map.put(x, count);
				// count=count+1;
			}

		}
		return map;

	}

	public void occurence(Map<Character, Integer> map) {
		Set<Entry<Character, Integer>> entrySet = map.entrySet();

		for (Entry<Character, Integer> entry : entrySet) {

			System.out.print("Character: " + entry.getKey() + " count: ");

			System.out.println(entry.getValue());

		}
	}

	public static void main(String arg[]) {
		CharRepetation charRepetation = new CharRepetation();
		// occuranceOfCharacters.findOccurance("madam");
		charRepetation.occurence(charRepetation.findCharacter("madam"));

	}

}
