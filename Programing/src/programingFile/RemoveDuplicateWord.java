package programingFile;

import java.util.LinkedHashSet;

public class RemoveDuplicateWord {
	public static void main(String[] args) {
		String s="welcome to TYSS welcome to bangalore welcome";
		String[] str=s.split(" ");

		//step 1: create any set collection and add all string array values into set
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			hs.add(str[i]);
		}
		for (String word : hs) {
			System.out.print(word+" ");
		}
	}
}
