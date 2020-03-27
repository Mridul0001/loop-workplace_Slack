/*
 * Write a program to take user input of all the data types (primitive and reference) and print them on screen
 * Mridul Mahajan*/
package basics;

import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {
	/*creating Scanner class object
	 * it will be used to take user inputs*/
	Scanner scan = new Scanner(System.in);
	byte b = scan.nextByte(); //Byte type input
	short s = scan.nextShort(); // Short type input
	int i= scan.nextInt(); // Integer type input
	long l = scan.nextLong(); // Long type input
	float f = scan.nextFloat(); // Float type input
	double d = scan.nextDouble(); // Double type input
	String str = scan.next(); // String type input
	
	//printing to screen
	System.out.println("byte: "+b+"\nshort: "+s+"\nint: "+i+"\nlong: "+l+
			"\nfloat: "+f+"\ndouble: "+d+"\nString: "+str);
	
}
}
