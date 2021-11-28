package programingFile;

public class PrimeNumber {
	public static void main(String[] args) {
		int m=0,flag=0;
		int n=8;
		m=n/2;
		if(n==0||n==1){
			System.out.println("not prime");
		}
		else {
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("is prime");
			}
		}
	}
}