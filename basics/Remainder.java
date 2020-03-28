/*Write a program to take two numbers as input from user and find their remainder
 * Mridul Mahajan*/
package basics;

import java.util.Scanner;

public class Remainder {
public static void main(String[] args) {
	//Creating Scanner class object
	Scanner scan = new Scanner(System.in);
	//taking two number as input from user
	System.out.println("Enter two numbers");
	int a=scan.nextInt();
	int b=scan.nextInt();
	
	//finding remainder of two numbers and storing result in another variable
	int result = a%b;
	//displaying result on screen
	System.out.println("Remainder of given numbers is: "+result);
}
}
