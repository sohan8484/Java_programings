package programingFile;

import java.util.Scanner;

public class PalindromeNo {
public static void main(String[] args) {
	
	int n=123;
	int rev=0;
	int temp=n;
	while (n>0) {
		rev=rev*10+(n%10);
		n=n/10;
	}
	if(rev==temp) {
		System.out.println("palindrome");
		}
	else
		System.out.println("not palindrome");
}
}
