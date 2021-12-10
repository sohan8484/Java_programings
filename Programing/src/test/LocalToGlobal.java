package test;

class LocalToGlobal {
int a=69;
void m1(int a) {
	 this.a=20;
	System.out.println(a);
	}
public static void main(String[] args) {
	LocalToGlobal tf=new LocalToGlobal();
	System.out.println("1="+tf.a);
	tf.m1(33);
}
}