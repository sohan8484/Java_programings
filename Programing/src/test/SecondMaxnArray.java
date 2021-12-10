package test;


public abstract class SecondMaxnArray {

	public static void main(String[] args) {

		int a[]= {10,11,12,1,4,6,7,30,25,40};
		int max=a[0]; 
		int SecMax=a[0];

		for (int i = 0; i < a.length; i++) { 
			if(a[i]>max) {
				SecMax=max; 
				max=a[i];
			}
			else if(a[i]>SecMax) { 
				SecMax=a[i]; 
			} 
		} 
		System.out.println(SecMax);


	}
}
