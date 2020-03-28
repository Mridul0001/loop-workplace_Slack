/*Write a program to take three numbers (a, b, c) as input then print "true" if b>a and b<c, print "false" otherwise.
 * Mridul Mahajan*/
package basics;

import java.util.Scanner;

public class GreaterThanLessThan {
public static void main(String[] args) {
	/* > is a relational operator. (A > B) is true when A is greater than B and false if A is not greater than B.  
	 * < is a relational operator. (A < B) is true when A is less than B and false if A is not less than B.
	 * && is called logical AND operator (A && B) will be true if A is true as well as B is true, otherwise false. */
	
	//creating Scanner class object
	Scanner scan = new Scanner(System.in);
	//taking three numbers as input from user
	System.out.println("Enter three numbers");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	
	if(b>a && b<c) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
}
