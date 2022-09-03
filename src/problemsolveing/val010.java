package problemsolveing;
import java.util.Scanner;
public class val010 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,s=0,p=1,t=0;
		do {
			System.out.println("Enter n");
			n = in.nextInt();
		}
		while(n<=0);
		
		for(int i=1;i<=n; i++)
		{
			if(i % 2 == 0) {
				p*=i;
				t+=p;
				
			}else {
				p*=i;
				s+=p;
				
			}
			
		}
		System.out.println("s ="+s);
		System.out.println("t ="+t);
	}

}
