package problemsolveing;

import java.util.Scanner;

public class val002 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n;
		
		double	 s=0;
		do {
			System.out.println("Enter n:");
			n=in.nextInt();
			
		}while(n<=0);
		
		for(double  jd=1;jd <=n;jd++) {
			
			 if (jd % 2 == 1){
			
			s += jd *(jd+1)  /( jd+1);
			}else {
				s -= jd *(jd+1) /( jd+1);

			}
		}
		System.out.println("s   =    "+s);
	}

}
