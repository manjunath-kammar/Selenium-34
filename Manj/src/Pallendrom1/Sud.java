package Pallendrom1;

public class Sud {
	public static void main(String[] args) {
		String s1="gadag";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev))
		{
			System.out.println("pallendrome");
		}
		else
		{
			System.out.println("not a pallendrome");
		}
	}

}
