package programingFile;

public class PalindromeString {
public static void main(String[] args) {
	String s="malam";
	String str="";
//	convert a sequence of characters stored in a string to an array of chars
	char ch[]=s.toCharArray();
	for (int i = 0; i < ch.length/2; i++) {
		char t = ch[i];
		ch[i] =ch[ch.length-1-i];
		ch[ch.length-1-i] =t;
	}
	str=new String(ch);
	if(str.equalsIgnoreCase(s)) {
		System.out.println("palindrome");
	}
	else
		System.out.println("not palindrome");
}
}
