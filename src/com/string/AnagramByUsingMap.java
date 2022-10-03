package com.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class AnagramByUsingMap {

	public static void main(String[] args) {

		String str1 = "race";
		String str2 = "care";

		if (str1.length() != str2.length()) {
			System.out.println("String is not anagram ");
		} else {
			//System.out.println("character of string1......");
			Map<Character, Integer> ch1map = new HashMap<>();
			for (int i = 0; i <= str1.length() - 1; i++) {
				char ch1 = str1.charAt(i);

				if (!ch1map.containsKey(ch1)) {
					ch1map.put(ch1, 1);
				} else {
					int count = ch1map.get(ch1);
					count++;
					ch1map.put(ch1, count);
				}

			}
			System.out.println(ch1map);
			//System.out.println("character of string2 ....");
			Map<Character, Integer> ch2Map = new HashMap<>();
			for (int j = 0; j <= str2.length() - 1; j++) {
				char ch2 = str2.charAt(j);

				
				if (!ch2Map.containsKey(ch2)) {
					ch2Map.put(ch2, 1);
				} else {
					int count = ch2Map.get(ch2);
					count++;
					ch2Map.put(ch2, count);

				}
				

			}
			if(Objects.equals(ch1map, ch2Map)){
			System.out.println("anagram");
			}else {
				System.out.println("not anagram");
			}
		}

		
		
		
		
	}
}
