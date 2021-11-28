package test;

import java.util.ArrayList;

public class MyName {
	public static void main(String[] args) {
		String s="my name is sohan from testyantra";
		String[] str=s.split(" ");
		int count=0;
		for (int i = 0; i < str.length; i++) {
			if(count<5) {
				System.out.print(str[i]+" ");
				count=count+str[i].length()+1;
			}
		}
	}
	}
