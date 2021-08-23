package com.bridgelabz.javafunctionalprograms;

import java.util.Scanner;

public class ThreeNumberSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter number of Integers:");
		int noOfIntegers = sc.nextInt();
		int[] integerArray = new int[noOfIntegers];
		
		System.out.println("Enter the numbers:");
		for(int index=0;index<noOfIntegers;index++) {
			integerArray[index] = sc.nextInt();
		}
		
		System.out.println("The triplets are:");
		for(int i=0;i<noOfIntegers;i++) {
			for(int j=i+1;j<noOfIntegers;j++) {
				for(int k=j+1; k<noOfIntegers;k++) {
					if(integerArray[i] + integerArray[j] + integerArray[k] == 0) {
						System.out.println(integerArray[i]+", "+integerArray[j]+", "+integerArray[k]);
					}
				}
			}
		}

	}

}
