package com.bridgelabz.javafunctionalprograms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a,b,c coefficents");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double delta=b*b - 4.0*a*c;
		if (delta> 0.0)   
		{  
		double root1 = (-b + Math.pow(delta, 0.5)) / (2.0 * a);  
		double root2 = (-b - Math.pow(delta, 0.5)) / (2.0 * a);  
		System.out.println("The roots are " + root1 + " and " + root2);  
		}   
		else if (delta == 0.0)   
		{  
		double r1 = -b / (2.0 * a);  
		System.out.println("The root is " + r1);  
		}   
		else   
		{  
		System.out.println("Roots are not real.");  
		}  
			
	}

}
