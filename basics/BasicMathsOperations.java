/*
 * Write a program to add, subtract, divide, multiply two numbers
 * Mridul Mahajan*/
package basics;

public class BasicMathsOperations {
	public static void main(String[] args) {
		int a=5, b=5; //two int type variables initialized with values
		int result=0; //variable to store the result of various operations
		
		result=a+b; //adding two numbers
		System.out.println("Sum of a and b is: "+result);
		
		result=a-b; //subtracting two numbers
		System.out.println("Difference of two a and b: "+result);
		
		result=a*b;//multiplying two numbers
		System.out.println("Product of a and b: "+result);
		
		result=a/b;//dividing two numbers
		System.out.println("Division of two numbers: "+result);
	}
}
