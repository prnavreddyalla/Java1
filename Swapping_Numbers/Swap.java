package org.panda.in;
import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the First Number");
		int x1=s.nextInt();
		System.out.println("Enter the Second Number");
		int x2=s.nextInt();
		System.out.println("Initialized Values are " + x1 +" and "  + x2);
		x1=x1+x2;
		x2=x1-x2;
		x1=x1-x2;
		System.out.println("Swapped Values are " + x1 +" and "  +x2);
	
	}
}
