package Primenumber;

public class Rockey {
	public static void main(String[] args) {
		int no=37;
		boolean flag=true;
		for(int i=2;i<=no;i++)
		{
			if(no%2==0)
			{
				flag=false;
				break;
			}
				if(flag==true)
				{
					System.out.println("it is aprime number");			
				}
				else
		          {
			         System.out.println("it is not prime nuber");
		          }
		}
	}
		
	}


