package problemsolveing;

import java.util.Scanner;

public class sumform1toN {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

		 int n;
		int s = 0;
		 do {
			 System.out.println("enter n :");
			n=in.nextInt();
		 }
		while(n<=0);
		 for(int i =1;i<=n;i++) {
			 s+=i;
			
		 }
		 System.out.println("Sum n :"+s);
		 
		 for(int i =1;i<=n;i++) {
			 s*=i;
			
		 }
		 System.out.println("mul n :"+s);
	 
	}
}
