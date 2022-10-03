package com.string;

import java.util.ArrayList;
import java.util.List;

public class SeperateCharacter {
	String str = "AshWini29";
	List<Character> list = new ArrayList<Character>();
	List<Character> list1 = new ArrayList<Character>();
	List<Character> list2 = new ArrayList<Character>();

	public void getchar() {
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				list.add(ch);
			} else if (ch >= 'a' && ch <= 'z') {

				list1.add(ch);
			} else if (ch >= '0' && ch <= '9') {
				list2.add(ch);

			}

		}

		System.out.println("capital letter : " + list);
		System.out.println("small letter : " + list1);
		System.out.println("number : " + list2);
	}

	public static void main(String[] args) {

		SeperateCharacter obj = new SeperateCharacter();
		obj.getchar();
	}

}
