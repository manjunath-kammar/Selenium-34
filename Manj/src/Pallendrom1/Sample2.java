package Pallendrom1;

public class Sample2 {
	public static void main(String[] args) {
		int no=121;
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
			System.out.println("its a palendrome");
		}
		else
		{
			System.out.println("its not a palendrome");
		}
	}

}
