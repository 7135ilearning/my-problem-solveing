package problemsolveing;
import java.util.Scanner;
public class SandMandDandS {

public static void SandMandDandS() {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a number: ");
	 int a =sc.nextInt();
	 System.out.print("Enter n number: ");

	 int n =sc.nextInt();
	 int r;
	 r=a+n;
	 r=a-n;
	 System.out.println(a+"+"+n+"="+r);

	 System.out.println(a+"-"+n+"="+r);
	 r=a*n;
	 System.out.println(a+"*"+n+"="+r);
	 r=a/n;
	 System.out.println(a+"/"+n+"="+r);
	 r=a%n;
	 System.out.println(a+"%"+n+"="+r);

	 
}
	public static void main(String[] args) {
		SandMandDandS();

	}

}
