package problemsolveing;
import java.util.*;
public class val001 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n;
		
		double	 s=0;
		do {
			System.out.println("Enter n:");
			n=in.nextInt();
			
		}while(n<=0);
		
		for(double  i=1.0;i <=n;i++) {
			//s+=1/i;
			s += 1 / i;
		}
		System.out.println("s   =    "+s);
	}
}
