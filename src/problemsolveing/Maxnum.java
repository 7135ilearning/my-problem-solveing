package problemsolveing;
import java.util.*;
public class Maxnum {
	public static void max() {

Scanner sc = new Scanner(System.in);


System.out.print("Enter a number: ");
int a= sc.nextInt();
System.out.print("Enter n number: ");
int n=sc.nextInt();
if(a>n) {
	
	System.out.println("Result:"+a+">"+n);

}else {
	
	System.out.println("Result:"+a+"<"+n);

}
	}

	public static void main(String[] args) {
		max();

	}

}
