package problemsolveing;
import java.util.Scanner;

public class minandmax {
	public static void minandmax() {
		Scanner sc = new Scanner(System.in);
		int a,n;
		 System.out.print("Enter first number: ");
		a=sc.nextInt();
		 System.out.print("Enter second number: ");
		n=sc.nextInt();
		if(n>a) {
			System.out.println("The lowest number is: "+n);
		}else if (a==n) {
			  System.out.println("They are equal");
			  }else {
			System.out.println("The lowest number is: "+a);
		}
	}
	public static void main(String[] args) {
		minandmax();

	}

}
