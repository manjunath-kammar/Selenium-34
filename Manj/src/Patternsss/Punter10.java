package Patternsss;

public class Punter10 {
	public static void main(String[] args) {
		int space=3;
		int star=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=space;j--)
			{
				System.out.print(" ");
			}
				for(int k=1;k<=star;k++)
				{
					System.out.print("i");
				}
				System.out.println();
				space --;
				star ++;
			}
		}
	}


