package test;



public class OccuranceWithoutInBuilt {
	public static void main(String[] args) {
		String s="purplle";

		for(int i=0;i<s.length()-1;i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++) {
				
				if(s.charAt(i)==s.charAt(j))

				{

					count++;

				}
			}
			System.out.println(s.charAt(i)+" "+count);
		}

	}
}