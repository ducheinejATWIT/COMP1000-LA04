/*
 * {write a method to calculate the greatest common divisor} (GCD) of {two positive} integers 
 * using Euclid’s algorithm. 
 * Then write a main method that requests {two positive} integers from the user. 
 * {validates the input}, calls your {method to compute the GCD},
 * and {outputs the return value of the method} (all user input and output should be done in main)
 */

import java.util.Scanner;

public class LA4a {

public LA4a() {	}
	
public static int gcd(int a, int b) {
	//Inputing the GCD method into actual Code.
	int t, k;
	
	
	while (b != 0) {
			
	  t = b;
	  b = a % b;
	  a = t;
	 
		
	}
	
	return a;
			
	}

public static void main(String[] args) {

	// The variables for the Program.
	System.out.printf("Enter Two Numbers ");
	Scanner input = new Scanner(System.in); 
	int a,b;
	
	a = input.nextInt();
	b = input.nextInt();
	
	int ret = LA4a.gcd(a,b);
	
	System.out.printf("GDC = " + ret);

	}

}
