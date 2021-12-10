package test;

import java.util.HashSet;

public class Wraper {
	public static void main(String[] args) {
		String s="12312345456";
		int sum=0;
		HashSet<Character> hs=new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		for (Character ch : hs) {
			int n=ch-48;
			sum=sum+n;
		}
		System.out.println(sum);
	}
}