package test;

public class VowelsFromString {
public static void main(String[] args) {
	String s="sohan";
	char[] ch=s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]=='a' ||ch[i]=='o'||ch[i]=='i'||ch[i]=='e') {
			System.out.print(s.charAt(i));
		}
	}
}
}