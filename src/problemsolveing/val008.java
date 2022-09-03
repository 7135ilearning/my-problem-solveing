package problemsolveing;

import java.util.Scanner;

public class val008 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,s =0,p;
		do
		{
			System.out.println("Enter n");
			n= in.nextInt();
		}
		while(n<=0);
		
		for(int i = 1 ; i <= n ; i++) 
		{
			
			p = 1;
			if(i % 2==0) {
			for(int j = 1 ; j <= i ; j++)
			{
				
				p *= i ;
				}
			}
			if(i % 2==0) {
				
			
			s+=p;
			}else 
			{
				s-=p;	
			}
			}

		
		System.out.println("s = "+s);

	}

}
