package programingFile;

import java.util.LinkedHashSet;

public class RemoveDuplicatesCharacter {
	public static void main(String[] args) {

		String s="india";
		LinkedHashSet<Character>hs = new LinkedHashSet<Character>();//maintains insertion order
		//	HashSet<Character> hs=new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		//	extract each character from the String
		for(char ch:hs) {
			System.out.print(ch);
		}
	}
}