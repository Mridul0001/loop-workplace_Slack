/*Write a program showing use of label with 'continue' and 'break'.
 * Mridul Mahajan*/
package basics;

public class ContinueBreakLabel {
public static void main(String[] args) {
	/*JAVA does not have goto statement like c/c++, but JAVA supports label
	 * label is useful only with nested loops because we can jump to a specific
	 * outer loop using label with continue or break*/
	
	outer: for(int i=1;i<5;i++) {
		for(int j=0;j<5;j++) {
			if(i == 3) {
				break outer; // if i becomes 3 then execution of outer loop will be stopped
			}
			if(j==1) {
				continue outer; //if j is 1, control will be passed to outer loop
			}
			System.out.println("Value of i and j: " +i+ " and " +j);
		}// inner loop ends
	}//outer loop ends
}
}
