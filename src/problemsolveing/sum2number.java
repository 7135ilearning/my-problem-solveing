package problemsolveing;
import java.util.*;
public class sum2number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	Scanner sc = new Scanner(System.in);
	int a ,s=0 ;
      do {
      System.out.println("enter num");
      a= sc.nextInt();
      }
      while(a<0);
      System.out.print("S = ");
      
      for (int i = 1; i <= a; i++)
      {
          System.out.print(i + ((i < a)?" + ": ""));
          s += i;
      }
      
      System.out.println("\nS = " + s);
      
	}

}
