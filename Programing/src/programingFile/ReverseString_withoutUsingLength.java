package programingFile;

public class ReverseString_withoutUsingLength {
public static void main(String[] args) {
	String s="sohan";
	int count =0;
	char[] c=s.toCharArray();
	for(char ch: c) {
		System.out.println(ch);
		count++;
	}
	for(int i=count-1; i>=0; i--) {
		System.out.print(s.charAt(i));
	}
	
}
}