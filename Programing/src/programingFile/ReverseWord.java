package programingFile;

public class ReverseWord {
public static void main(String[] args) {
	String s="welcome to india test yantra";
	String[] str=s.split(" ");
//	for (int i = str.length-1; i >=0; i--) {
//		System.out.print(str[i]+" ");
//	}
	for(String word:str) {
		String s1=word+" ";
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
	}
}
}

