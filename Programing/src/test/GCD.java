package test;

import java.util.Iterator;

public class GCD {
	public static void main(String[] args) {
		int num1=10,num2=20;
		int gcd=0;
		int Lnum=num1;
		if(num1>num2)
		{
			Lnum=num2;
		}
//			for(int i=Lnum; i>=1; i--) {
			for (int i = 1; i <=Lnum ; i++) {
				if(num1%i==0 && num2%i==0) {
					gcd=i;
				}
			
		
		
	}
			System.out.println(gcd);
}
}