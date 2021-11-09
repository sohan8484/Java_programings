package arrayBased;

public class SumOfFirstThreeMin {
	public static void main(String[] args) {
		int sum=0;
		int a[]= {30,20,50,10,40};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of first three minimum no "+sum);
	}
}