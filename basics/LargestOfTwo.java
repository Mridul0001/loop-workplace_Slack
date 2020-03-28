/*Write a program to find largest of two numbers (use if...else statements).
 * Mridul Mahajan*/
package basics;

import java.util.Scanner;

public class LargestOfTwo {
public static void main(String[] args) {
	/*Conditional statements in JAVA
	 * if(a condition is true){
	 * 	perform this}
	 * else{
	 * 	perform this}  */
	//Creating Scanner class object
	Scanner scan = new Scanner(System.in);
	// declaring two int variables
	int a,b;
	//taking user input
	System.out.println("Enter two numbers");
	a=scan.nextInt();
	b=scan.nextInt();
	
	//finding largest of two numbers
	if(a>b) {  // > is a relational operator which checks if left operand is greater than right or not.
		System.out.println(a + " is greater");
	}else {
		System.out.println(b + " is greater");
	}
}
}
