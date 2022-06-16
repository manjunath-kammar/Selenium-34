package Arrayproblems;

public class Abc1 {
	public static void main(String[] args) {
		int[]arr={15,5,35,50,91};
		int n=arr.length;
		int largest=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println(largest);
	} 

}
