package Reversestring;

public class Demo1 {
	public static void main(String[] args) {
		String m="Bharath";
		String a="";
		for(int i=6;i>=0;i--)
		{
			a=a+m.charAt(i);
		}
		System.out.println(a);
	}

}
