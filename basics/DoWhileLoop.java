/*Write a program to demonstrate how do..while loop is different from for and while loops.
 * Mridul Mahajan*/
package basics;

public class DoWhileLoop {
public static void main(String[] args) {
	/*do{
	 * .....code goes here......
	 * increment/decrement}while(condition);
	 * it works same as other two loops. The difference apart from syntax between
	 * do..while and for or while is that the code inside do block will execute at least 
	 * once even if the condition on the first iteration is false*/
	
	//demonstration of do while loop
	int i = 5;
	do {
		System.out.println("This will be printed at least once");
		i++;
	}while(i<5);
}
}
