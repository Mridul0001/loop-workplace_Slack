/*Write a program to demonstrate use of 'switch' statement in JAVA.
 * Mridul Mahajan*/
package basics;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
	/*switch statement is multi-way branch statement
	 * switch(expression){
	 * 	case value_1:
	 * 		...statements....
	 * 		break;  // if break is not used then execution will continue to next case 
	 *                 until break is found or all cases gets executed
	 *	case value_2:
	 *		...statements....
	 *		break;
	 *  .
	 *  .
	 *  .
	 *  default: // default will execute if none of the cases executes
	 *  	...statements...
	 *  	// no break is needed in default case}*/
	
	//creating Scanner class object
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number between 1 and 3");
	int i = scan.nextInt();
	
	switch(i) {
	case 1:
		System.out.println("Case 1");
		break;
	case 2:
		System.out.println("Case 2");
		break;
	case 3:
		System.out.println("Case 3");
		break;
	default:
		System.out.println("Invalid case");
	} // end of switch statement
}
}
