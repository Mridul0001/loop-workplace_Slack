/*Write a program to demonstrate use of 'continue' and 'break' statements in JAVA.
 * Mridul Mahajan*/
package basics;

public class ContinueBreak {
public static void main(String[] args) {
	/*continue statement is used to jump out of the loop and skips current iteration
	 * break statement is used to jump out of the loop and stops the loop completely
	 * Note: break is also used with switch statement*/
	for(int i=1;i<10;i++) {
		if(i==5) {
			continue; //skips the iteration when i is equal to 5
		}else if(i == 8) {
			break; //breaks the loop when i becomes equal to 8
		}
		System.out.println(i); //if none of the above is true than value of will be printed
	//Notice that 9 and 10 values will not be printed as loop breaks when i becomes 8.
	}
}
}
