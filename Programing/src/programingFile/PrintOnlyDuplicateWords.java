package programingFile;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicateWords {
	public static void main(String[] args) {
		String s="welcome to TYSS welcome to bangalore";

		String[] str=s.split(" ");
//step 1: create any set collection and add all string array values into set
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			hs.add(str[i]);
		}
//	step 2: compare each value of set with all the value of string array	
		for(String word:hs) {
			int count=0;
			for (int i = 0; i < str.length; i++) {
				if(word.equals(str[i])) {
					count++;
				}
			}
//	step3 : print both duplicate words
			if(count>1)
			System.out.print(word+" ");
		}
	}
}
