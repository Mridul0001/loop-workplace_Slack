/*Write a program to print sum of digits of a given number (use while loop).
 * Mridul Mahajan*/
package basics;

public class WhileLoop {
public static void main(String[] args) {
	/*while(condition){
	 *....code goes here....
	 * increment/decrement}
	 * while loop will keep running till the condition is true*/
	
	//initializing variable with a decimal number
	int num = 1234;
	//variable to store sum of digits of above number
	int sum = 0;
	//using while loop to calculate sum of digits
	while(num>0) {
		sum += num%10;
		num /= 10;
	}
	//printing sum to screen
	System.out.println("Sum of digits is: " + sum);
}
}
