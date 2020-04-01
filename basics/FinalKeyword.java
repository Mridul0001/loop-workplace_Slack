/*Write a program to demonstrate use of 'final' keyword in java.
 * Mridul Mahajan*/
package basics;

/*final keyword can be used with class, method and variable
 * classes declared as final can't be extended
 * methods declared as final can't be overridden
 * variables declared as final can't be assigned new value*/

//final class example
final class NotExtendable{}

//***uncomment following line
//class TryExtending extends NotExtendable{}

class FinalMethodExample{
	//final method example
	final void finalMethod() {System.out.println("This method is declared as final");}
}

public class FinalKeyword extends FinalMethodExample{
	//*** uncomment below line to override finalMethod() and see the effect
	//void finalMethod() {System.out.println("Trying to override final method");}
public static void main(String[] args) {
	//final variable example
	final int i = 1;
	//*** uncomment below line to see what happens if we try to assign new value to a variable declared as final
	//i=2;
}
}
