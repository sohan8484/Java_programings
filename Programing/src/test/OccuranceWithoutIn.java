package test;

public class OccuranceWithoutIn {
public static void main(String[] args) {
	String s="aaabbbcc";
	char ch[]=s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		for (int j = i+1; j < ch.length; j++) {
			if(ch[i]==ch[j]) {
				ch[j]='0';
			}
		}
	}
	for (char c : ch) {
//		if(c!='0') {
//			System.out.print(c);
//		}
		int count=0;
			for (int i = 0; i < ch.length; i++) {
				if(c==s.charAt(i)) {
					count++;
				}
			}
			System.out.println(c+"-"+count);
		}
	}
	
	
	
}

