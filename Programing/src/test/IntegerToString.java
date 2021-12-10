package test;

import java.util.ArrayList;
import java.util.HashSet;

public class IntegerToString {
	public static void main(String[] args) {
		
	String s="200";
	int x=0;
	for (int i = 0; i < s.length(); i++) {
		x = x*10+((int)s.charAt(i)-48);
		
	}
	System.out.print(x);
	
}
}