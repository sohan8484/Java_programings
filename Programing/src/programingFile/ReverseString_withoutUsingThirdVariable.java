package programingFile;

public class ReverseString_withoutUsingThirdVariable {
public static void main(String[] args) {
	String s1 = "god es great";
	for(int i=s1.length()-1; i>=0; i--) {
		System.out.print(s1.charAt(i));
	}
}
}
