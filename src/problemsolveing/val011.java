package problemsolveing;

import java.util.Scanner;

public class val011 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,p=1,t=0;
		double s =0;
		do {
			System.out.println("Enter n");
			n = in.nextInt();
		}
		while(n<=0);
	
		for(int i=1;i<=n; i++)
		{
			p*=i;
			s += 1d /(i+p);
		}

		System.out.println("s="+s);
	}

}
