package programingFile;

public class SwapFirstAndLastString {
public static void main(String[] args) {
	String s="welcome to india to america";
	String[] str=s.split(" ");
	String temp=str[0];
	str[0]=str[str.length-1];
	str[str.length-1]=temp;
	for (int i = 0; i < str.length; i++) {
		System.out.print(str[i]+" ");
	}
}
}
