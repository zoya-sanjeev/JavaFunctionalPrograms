package com.bridgelabz.javafunctionalprograms;

public class Distance {

	public static void main(String[] args) {
		int coordinateX=Integer.parseInt(args[0]);
		int coordinateY=Integer.parseInt(args[1]);
		double euclideanDistance=Math.sqrt(Math.pow(coordinateX,2)+Math.pow(coordinateY,2));
		System.out.println("Euclidean Distance="+euclideanDistance);

	}

}
