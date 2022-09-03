package problemsolveing;
import java.util.Scanner;

public class val004 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, s=0;
		 int f=1;
		do
		{
			System.out.println("Enter n");
			n = in.nextInt();
			
		}while ( n<=0);
		for(int i = 1 ; i<=n ; i ++)
		{
			
		
				 f*=i;
		s+=  f;	
			
		}
		System.out.println("s = "+s);
	}

}
