package problemsolveing;
import java.util.Scanner;

public class Avrage {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n1,n2,n3,n4,n5;
		float Avrage;
		System.out.println("Plass Enter n1");
		n1=in.nextInt();
		System.out.println("Plass Enter n2");
		n2=in.nextInt();
		System.out.println("Plass Enter n3");
		n3=in.nextInt();
		System.out.println("Plass Enter n4");
		n4=in.nextInt();
		System.out.println("Plass Enter n5");
		n5=in.nextInt();
		
		Avrage =(n1+n2+n3+n4+n5)/5;
		System.out.println("Avrage ="+Avrage);
	}

}
