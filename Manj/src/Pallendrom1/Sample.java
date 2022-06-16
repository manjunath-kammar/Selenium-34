package Pallendrom1;

public class Sample {
	public static void main(String[] args) {
		String s="GARAG";
		String rev="";
		for(int i=4;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("its palendrome");
		}
		else
		{
			System.out.println("not a palendrome");
		}
	}

}
