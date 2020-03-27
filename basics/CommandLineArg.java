/*Write a program to display your name on screen, passed as command line arguments.
 * Mridul Mahajan*/
package basics;

public class CommandLineArg {
	/*main method must contain a single String array parameter
	 * It is also possible to overload main method but 
	 * implementation of main method with only one parameter of String array is compulsory.
	 * Command line arguments will be passed as an array of strings to main method*/
	public static void main(String[] args) {
		System.out.println("Arguments passed from command line are: ");
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}
}
