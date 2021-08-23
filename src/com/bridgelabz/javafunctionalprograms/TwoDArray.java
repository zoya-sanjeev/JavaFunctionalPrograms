package com.bridgelabz.javafunctionalprograms;

import java.io.PrintWriter;
import java.util.Scanner;
public class TwoDArray {

	static Scanner sc= new Scanner(System.in);
	
	public static int[][] readIntArray(int rows, int columns){
		 int[][] array=new int[rows][columns];
		for(int indexRows=0;indexRows<rows;indexRows++)
			for(int indexColumns=0;indexColumns<rows;indexColumns++)
				array[indexRows][indexColumns]=sc.nextInt();
		return array;
	}
	
	public static double[][] readDoubleArray(int rows, int columns){
		 double[][] array=new double[rows][columns];
		for(int indexRows=0;indexRows<rows;indexRows++)
			for(int indexColumns=0;indexColumns<rows;indexColumns++)
				array[indexRows][indexColumns]=sc.nextDouble();
		return array;
	}
	
	public static boolean[][] readBooleanArray(int rows, int columns){
		boolean[][] array=new boolean[rows][columns];
		for(int indexRows=0;indexRows<rows;indexRows++)
			for(int indexColumns=0;indexColumns<rows;indexColumns++)
				array[indexRows][indexColumns]=sc.nextBoolean();
		return array;
	}
	
	public static void printIntegerArray(int [][] array) {
		PrintWriter printWriter = new PrintWriter(System.out);
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				printWriter.append(array[i][j]+" ");
			}
			printWriter.append("\n");
		}
		
		printWriter.flush();
	}
	
	public static void printDoubleArray(double [][] array) {
		PrintWriter printWriter = new PrintWriter(System.out);
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				printWriter.append(array[i][j]+" ");
			}
			printWriter.append("\n");
		}
		
		printWriter.flush();
	}
	
	public static void printBooleanArray(boolean [][] array) {
		PrintWriter printWriter = new PrintWriter(System.out);
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				printWriter.append(array[i][j]+" ");
			}
			printWriter.append("\n");
		}
		
		printWriter.flush();
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter number of rows and columns");
		int numberOfRows=sc.nextInt();
		int numberOfColumns=sc.nextInt();
		System.out.println("1.Integer array \n2.Double Array \n3.Boolean Array\nEnter choice");
		int choice=sc.nextInt();
		switch(choice) {
		
			case 1: System.out.println("Enter integer elements");
					int integerArray[][] =readIntArray(numberOfRows, numberOfColumns);
					printIntegerArray(integerArray);
					break;
			case 2:	System.out.println("Enter double elements");
					double doubleArray[][] =readDoubleArray(numberOfRows, numberOfColumns);
					printDoubleArray(doubleArray);
					break;
			
			case 3:	System.out.println("Enter boolean elements");
					boolean booleanArray[][] =readBooleanArray(numberOfRows, numberOfColumns);
					printBooleanArray(booleanArray);
					break;
		}
		
		
		
		

	}

}
