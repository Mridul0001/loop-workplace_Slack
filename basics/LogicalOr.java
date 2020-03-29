/*Write a program to take a number as input and print "true" if number is equal to 1 or 5, print "false" otherwise(use logical or operator).
 * Mridul Mahajan*/
package basics;

import java.util.Scanner;

public class LogicalOr {
public static void main(String[] args) {
	/* || is called logical OR operator. 
	 * (A || B) will be true if either A or B is true
	 * == is a relational operator which means equal to
	 * a==b will return true if a is equal to b, otherwise false.*/
	//Creating Scanner class object
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int a = scan.nextInt();
	//checking for conditions
	if(a==1 || a==5) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
}
