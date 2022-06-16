package TY;

public class Sample {
	public static void main(String[] args) {
	     Qspider d=new Qspider();
	     Jspider p=(Jspider) d;
	}

}
class Qspider
{
	void inform()
	{
		System.out.println("aafada");
	}
}
class Jspider extends Qspider

{
	void disp()
	{
		System.out.println("agfkad");
	}
}
