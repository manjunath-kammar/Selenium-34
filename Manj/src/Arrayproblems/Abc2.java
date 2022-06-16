package Arrayproblems;

public class Abc2 {
	public static void main(String[] args) {
		int[]arr={70,91,35,101,95};
		int fl=0;
		int sl=0;
		int tl=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>fl)
			{
				tl=sl;
				sl=fl;
				fl=arr[i];
			}else if(arr[i]>sl)
			{
				tl=sl;
				sl=arr[i];
			}else
			{
				tl=arr[i];
			}
		}
		System.out.println(fl);
		System.out.println(sl);
		System.out.println(tl);
	}

}
