package test;

import java.util.Scanner;

public class PrimeNo {
	public static boolean isPrimeNumber(int num)
	{
		if (num<=1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void getPrimeNumber(int num) {
		for(int i=2; i<=num; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPrimeNumber(n));
		getPrimeNumber(100);
	}
}