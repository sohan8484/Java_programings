package programingFile;


public class PrimeNoOrNot {
	public static void main(String[] args) {
		int n=129;	
		int temp=0;
		while(n!=0) {
			int rem=n%10;
			temp=temp*10+rem;
			n=n/10;
		}
		System.out.println(temp);
		}
	}
