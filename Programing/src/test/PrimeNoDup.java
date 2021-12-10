package test;

public class PrimeNoDup {
public static void main(String[] args) {
	int n=2;
	if(n==1) {
		System.out.println("should be greater than 2");
	}
	while(n!=0) {
		for (int i = 2; i <=n; i++) {
			if(n%i==0) {
				System.out.println("not prime");
				break;
			}
			else {
				System.out.println("prime");
			}
		}
		break;
	}
}
}
