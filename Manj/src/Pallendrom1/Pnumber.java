package Pallendrom1;

public class Pnumber {
	public static void main(String[] args) {
		int no=1221;
		int k=no;
		int sum=0;
		while(no!=0)
		{
			int rev=no%10;
			sum=sum*10+rev;
			no=no/10;
			
		}
		if(k==sum)
		{
			System.out.println("no is palendrome");
		}
		else
		{
			System.out.println("no is not a pallendrome");
		}
	}

}
