package Reversestring;

public class Demo {
	public static void main(String[] args) {
		String S="Manju";
		String rev="";
		{
			for(int a=4;a>=0;a--)
			{
				rev=rev+S.charAt(a);
			}
		}
		System.out.println(rev);
	}

}
