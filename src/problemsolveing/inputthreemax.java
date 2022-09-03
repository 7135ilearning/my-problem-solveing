package problemsolveing;

import java.util.Scanner;

public class inputthreemax {
	public static void inputthreemax() {

Scanner sc = new Scanner(System.in);

   int a,n,c,manum;
   
   System.out.print("Enter a number: ");
   
   a= sc.nextInt();
   
   System.out.print("Enter n number: ");
   
   n=sc.nextInt();
   
   System.out.print("Enter c number: ");
   
   c=sc.nextInt();
 
        if(a>n&&a>c) {
          	manum =a;
         }else if(n>a&&n>c) {
	        manum =n;
	
	     }else {
	      	manum =c;
	     }
          System.out.println("The max number is: "+manum);
	}
	public static void main(String[] args) {
		inputthreemax();
	}

}
