package programingFile;

import java.util.Scanner;

public class PalindromeNo {
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int rev=0;
	int a=n;
	while (a!=0) {
		rev=rev*10+(a%10);
		a=a/10;
	}
	if(rev==a) {
		System.out.println("palindrome");
		}
	else
		System.out.println("not palindrome");
}
}
