
package basics;

import java.util.Scanner;

public class LargestOfThree {
public static void main(String[] args) {
	/*Conditional statements in JAVA
	 * if(a condition is true){
	 * 	perform this}
	 * else if(check this condition if above is not true, if this is true){
	 * 	perform this}
	 * else{
	 * 	perform this}  */
	//Creating Scanner class object
	Scanner scan = new Scanner(System.in);
	// declaring three int variables
	int a,b,c;
	//taking user input
	System.out.println("Enter three numbers");
	a=scan.nextInt();
	b=scan.nextInt();
	c=scan.nextInt();
	
	//finding largest of three numbers
	if(a>b && a>c) {  // && is called logical AND operator (A && B) will be true if A is true as well as B is true.
		System.out.println(a + " is greater");
	}else if(b>a && b>c){
		System.out.println(b + " is greater");
	}else{
		System.out.println(c + " is greater");
	}
}
}
