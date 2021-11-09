package programingFile;

public class SumOfNumberOfnumber {
public static void main(String[] args) {
	int n=564654;
	while(n>9) {
		int sum=0;
		while (n>0) {
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		n=sum;
	}
	System.out.println(n);
}
}
