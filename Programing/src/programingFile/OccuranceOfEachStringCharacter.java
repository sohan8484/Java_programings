package programingFile;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OccuranceOfEachStringCharacter {
public static void main(String[] args) {
	String s="malyalam";
//	step 1 create any type of set collection and add all the characters of the given string
	LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
//	HashSet<Character> hs=new HashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		hs.add(s.charAt(i));
	}
	
//	int count=0;(3 4 6 8)
//	extract each character from the String
	for(char ch:hs) {
		int count=0;
//		compare the extracted character to the original string
		for (int i = 0; i < s.length(); i++) {
//			if it is equals change the count to the increament
			if(ch==s.charAt(i)) {
				count++;
			}
		}
//		print both character and count
		System.out.println(ch+"-"+count);
	}
}
}
