package Splitfunction1;

public class Hunter {
	public static void main(String[] args) {
		String s="nanna manasalli ninge jaaga illa";
		String[]arr=s.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
