/*Write a program to print multiplication table of a number upto 10 (use for loop).
 * Mridul Mahajan*/
package basics;

public class ForLoop {
public static void main(String[] args) {
	/*for(initialization; stopping condition; increment/decrement)
	 * code inside for loop will keep executing until stopping condition is met*/
	//printing multiplication table of 2 upto 10 using for loop
	
	for(int i=1;i<=10;i++) {
		System.out.println("2 * " +i+ " = " +(2*i));
	}
}
}
