package test;

public class Maximum {
public static void main(String[] args) {
	int[] a= {29,44,405,0,23};
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	System.out.print(a[i]);
	}
	
}
}
