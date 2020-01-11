package com.countingvowels;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class CountingVowels {

	public static void main(String[] args) {
		String word = "EsEhello RAauLi";
		countVowelsOneByOne(word);

	}

	private static void countVowelsOneByOne(String word) {
		word = word.toLowerCase();
		LinkedHashMap<Character, Integer> mapp = new LinkedHashMap<>();
		mapp.put('a', 0);
		mapp.put('e', 0);
		mapp.put('i', 0);
		mapp.put('o', 0);
		mapp.put('u', 0);

		for (int i = 0; i < word.length(); i++) {
			if (mapp.containsKey(word.charAt(i))) {
				int count = mapp.get(word.charAt(i));
				mapp.put(word.charAt(i), ++count);
			}
		}
		System.out.println(mapp);
	}

}
