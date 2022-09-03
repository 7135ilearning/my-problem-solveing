package problemsolveing;

import java.util.Scanner;

public class val012 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,p=1;
		double t=0;
		double s =0;
		  String ss[] = {"h","e","l","l","o"};
	        for(int i =0 ; i<= ss.length ;i++ ){
	           String aa [] = null ;
	                System.out.print(aa[i]);
	        }
		do {
			System.out.println("Enter n");
			n = in.nextInt();
		}
		while(n<=0);
	
		for(int i=1;i<=n; i++)
		{
			if(i % 2 == 1)
			{
				p*=i;
			}else if(i % 2 ==0)
			{
				s+=(p/1d);
				
			}
		}
		System.out.println("s="+s);
	}

}
