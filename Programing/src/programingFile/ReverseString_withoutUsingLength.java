package programingFile;

public class ReverseString_withoutUsingLength {
public static void main(String[] args) {
	String s="sohan";
	int count =0;
	String rev="";
	char[] c=s.toCharArray();
	for(char ch: c) {
		count++;
	}
	for(int i=count-1; i>=0; i--) {
	//	rev=rev+s.charAt(i);
		System.out.print(s.charAt(i));
	}
//	System.out.println(rev);
	
}
}
