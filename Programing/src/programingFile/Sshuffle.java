package programingFile;

public class Sshuffle {
public static void main(String[] args) {
	int[] a= {2,5,0,7,5,0,9,0};
	int[] b=new int[a.length];
	int j=0;
	int k=a.length-1;
	for (int i = 0; i < b.length; i++) {
		if(a[i]!=0) {
			b[j]=a[i];
			j++;
		}
		else {
			b[k]=a[i];
			k--;
		}
	}
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i]+" ");
	}
}
}
