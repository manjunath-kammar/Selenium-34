package Strongnumber;

public class Armstrong {
	public static void main(String[] args) {
		int no=153;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		if(copy==sum)
		{
			System.out.println("its arm strong number");
		}
		else
		{
			System.out.println("not a arm strong number");
		}
	}

}
