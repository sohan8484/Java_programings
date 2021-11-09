package programingFile;


public class ReverseString_Using3rdVariable {
public static void main(String[] args) {
	String s="snoop dog";
	String rev="";
	for(int i=s.length()-1; i>=0; i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
}
}
