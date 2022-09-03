package problemsolveing;

import java.util.Scanner;

public class val003 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n;
		int p;
		double	 s=0;
		do {
			System.out.println("Enter n:");
			n=in.nextInt();
			
		}while( n <= 0  );
		
		for(int i = 1 ; i <= n ; i++ ) 
		{
			
			p = 1 ;
			
		for(int  j = 1 ;j <=i ; j++)
		{
			p *= i;
			
		}
		
		s +=  p;
		
		}
		System.out.println("s   =    "+s);
	}

}
