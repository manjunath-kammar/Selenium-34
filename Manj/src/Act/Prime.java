package Act;

public class Prime {public static void main(String[] args) {
	int no=73;
	int a=0;
	for(int i=2;i<no;i++){
		if(no%i==0)
		{
			a=a+1;
		}
		if(a==no){
				
			
			System.out.println("its not a prime number");
		}else{
			System.out.println("its prime number");
		}
	}
}
}

