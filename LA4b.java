/*
 * {write a method to calculate the greatest common divisor} (GCD) of {two positive} integers 
 * using Euclid’s algorithm. 
 * Then write a main method that requests {two positive} integers from the user. 
 * {validates the input}, calls your {method to compute the GCD},
 * and {outputs the return value of the method} (all user input and output should be done in main)
 */

import java.util.Scanner;

public class LA4b {

public LA4b() {	}
	
//Slope Method
public static int slope(int a, int b, int c, int d) {
	//Inputing the GCD method into actual Code.
	int y = b;
	
	b = (c - a) / (d - b);
	  
	return y;
			
	}

//Slope Intercept Method
public static double int_slope(double y, double x, double m) {
	double p,b;
	
	//y = mx + b
	b = y - m*x;
	p = b;
	
	return m;
} 

//Area Of Circle Method
public static double area(double b) {
	
	double a;
	//A = 4*(Pie)*R^2 (The Psydo Code For The Area.)
	a = (4*3.14)*(b*b);
	
	return a;
} 

public static void main(String[] args) {
	
	try (Scanner input = new Scanner(System.in)) {
		
		int choice;
		
		System.out.printf("Choice an Equation: "
				+ "%n1) Slope Fomula %n2) Slope Intercept Form  %n3) Area of a Circle");
		
		choice = input.nextInt();
		
		if (choice == 1) {
	
		// The Slope Input/output
		System.out.printf("%nEnter Two intervals");
	 
		int a,b,c,d;
		
		System.out.printf("%nEnter First interval:");
		a = input.nextInt();
		b = input.nextInt();
		
		System.out.printf("%nEnter Second interval:");
		c = input.nextInt();
		d = input.nextInt();
		
		int ret = LA4b.slope(a,b,c,d);
		
		System.out.printf("Slope: " + ret);
		} else if (choice == 2) {
			
			System.out.printf("%nEnter Slope and an interval:");
			int y,x,m;
			
			System.out.printf("%nEnter Slope: ");
			m = input.nextInt();
			
			System.out.printf("%nEnter interval: ");
			x = input.nextInt();
			y = input.nextInt();
			
			double nested_slope_intercept = LA4b.int_slope(y,x,m);
			System.out.printf("Area: " + nested_slope_intercept);
			
		} else if (choice == 3) {
			
			System.out.printf("%nEnter Radius: ");
			double b;
			
			b = input.nextInt();
			
			double nested_area = LA4b.area(b);
			System.out.printf("Area: " + nested_area);
			
		}
	}

	}

	}


