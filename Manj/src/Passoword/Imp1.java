package Passoword;

public class Imp1 {
	public static void main(String[] args) {
	  String s1="Mk@143kaMmAR#";
	  String lc="";
	  String uc="";
	  String no="";
	  String spl="";
	  for(int i=0;i<s1.length();i++)
	  {
		  char ch=s1.charAt(i);
		  if((ch>=65)&&(ch<=90))
		  {
			  uc=uc+ch;
		  }
		  else if((ch>=98)&&(ch<=122))
		  {
			  lc=lc+ch;
		  }
		  else if((ch>=48)&&(ch<=57))
		  {
			  no=no+ch;
		  }
		  else
		  {
			  spl=spl+ch;
		  }
	  }
	  System.out.println(lc+"---->"+lc.length());
	  System.out.println(uc);
	  System.out.println(no);
	  System.out.println(spl);
	}

}
