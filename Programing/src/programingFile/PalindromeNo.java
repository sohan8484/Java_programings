package programingFile;

import java.util.Scanner;

public class PalindromeNo {
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int rev=0;
	while (n!=0) {
		rev=rev*10+(n%10);
		n=n/10;
	}
	if(rev==n) {
		System.out.println("palindrome");
		}
	else
		System.out.println("not palindrome");
}
}
