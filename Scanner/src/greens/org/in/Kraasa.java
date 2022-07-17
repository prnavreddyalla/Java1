package greens.org.in;

import java.util.Scanner;

public class Kraasa {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Age: ");
	int age =s.nextInt();
	if(age<50) {
	System.out.println("Age is " + age +  "  Eligible to Donate Blood");
}
	else {
		System.out.println("Not Eligible to Donate Blood");
	}
}}