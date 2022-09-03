package problemsolveing;

import java.util.Scanner;

public class options {
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        double a, b,o;
	        int optoins = -1;
	System.out.print("Enter first number: ");
    a = input.nextDouble();
    
    System.out.print("Enter second number: ");
    b = input.nextDouble();
    
    System.out.println(
            "\nWrite down the operation number then press enter\n"
            + "0: To end the program.\n"
            + "1: To print the sum.\n"
            + "2: To print the subtraction.\n"
            + "3: To print the multiplication.\n"
            + "4: To print the division.");
    while(optoins!=0) {
    System.out.print("Enter options number: ");
     optoins = input.nextInt();
    switch (optoins) {
	case 0:
		  System.out.println("Program end.");
          break;
	case 1:
		o=a+b;
		System.out.println("the sum \n"+o);
		break;
	case 2:
		o=a-b;
		System.out.println("the subtraction  \n"+o);
		break;
	case 3:
		o=a*b;
		System.out.println("the multiplication  \n"+o);
		break;
	case 4:
		o=a/b;
		System.out.println("the division \n"+o);
		break;

	default:
		break;
	}
}
	}}
