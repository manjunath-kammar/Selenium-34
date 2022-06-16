package String1;

public class Sam4 {
	public static void main(String[] args) {
		String s1="jakajakaja";
		int count=0;
		for(int i=0;i<=s1.length()-2;i=i+2)
		{
			if("ja".equals(s1.substring(i,i+2)))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
