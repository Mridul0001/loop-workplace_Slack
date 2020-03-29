/*Write a program to print multiplication table of 2,3 and 4 (upto 10 multiplications) in a single program (use nested for loop).
 * Mridul Mahajan*/
package basics;

public class NestedFor {
public static void main(String[] args) {
	/*we can also use for loop inside another for loop.
	 * This is called nested loop
	 * */
	
	//printing multiplication table of 2,3 and 4 to the screen
	for(int i=2; i<=4; i++) {
		System.out.println("Multiplication table of " +i+ ":\n");
		for(int j=1; j<=10; j++) {
			System.out.println(i + " * " +j+ " = " +(i*j));
		}
		System.out.println();
	}
}
}
