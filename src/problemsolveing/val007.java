package problemsolveing;
import java.util.Scanner;
public class val007 {

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
			if(i %2==1) {
				s +=  i;
				}
			else {
				
					
			p = 1;
			for(int j = 1 ; j <= i ; j++)
			{
				
				p *= i ;
				
			}
			s-=p;
			}
			
			}

		
		System.out.println("s = "+s);
	}

}
