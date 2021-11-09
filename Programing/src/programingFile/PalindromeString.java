package programingFile;

public class PalindromeString {
public static void main(String[] args) {
	String s="alam";
	String str="";
	char ch[]=s.toCharArray();
	for (int i = 0; i < ch.length/2; i++) {
		char t = ch[i];
		ch[i] =ch[ch.length-1-i];
		ch[ch.length-1-i] =t;
	}
	System.out.println(ch);
	str=new String(ch);
	if(str.equalsIgnoreCase(s)) {
		System.out.println("palindrome");
	}
	else
		System.out.println("not palindrome");
}
}
