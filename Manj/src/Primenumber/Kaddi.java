package Primenumber;

public class Kaddi {
	public static void main(String[] args) {
		int no=105;
		boolean flag=true;
		for(int a=2;a<=no;a++)
		{
			if(no%a==0)
			{
				flag=false;
				break;
			}
			if(flag==true)
			{
				System.out.println("its prime number");
			}
			else
			{
				System.out.println("its not a prime number");
			}
		}
	}

}
