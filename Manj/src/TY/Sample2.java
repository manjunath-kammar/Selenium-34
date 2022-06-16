package TY;

import java.util.Scanner;

public class Sample2 {public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter row");
	 int r =sc.nextInt();
	 System.out.println("enter col");
	 int c =sc.nextInt();
	 int S[][] = new int[r][c];
	 System.out.println("enter array valuve");
	 for(int i=0;i<r;i++){
		 for(int j=0;j<c;j++){
			 S[i][j]=sc.nextInt();
		 }
	 }
	 for(int i=0; i<r;i++){
		 for(int j=0; j<c;j++){
			 System.out.print(S[i][j]);
		 }
		 System.out.println();
	 }
	 
	
}

}
