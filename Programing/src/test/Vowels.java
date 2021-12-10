package test;

public class Vowels {
public static void main(String[] args) {
	String s="aeiouzxcv";
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i)=='a' || s.charAt(i)=='e') {
			System.out.print(s.charAt(i));
		}
	}
}
}
