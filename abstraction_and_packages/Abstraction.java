/*Write a program to demonstrate use of 'abstract' keyword in JAVA.
 * Mridul Mahajan*/
package abstraction_and_packages;

/*Abstraction means showing only relevant data and hiding unnecessary data
 * of an object from user. 'abstract' is a non-access modifier in JAVA.
 * It can be used with classes and methods but not variables
 * 
 * 1. Abstract class : can contain abstract as well as concrete methods. Can't be 
 * instantiated. Provides partial abstraction because it can contain concrete methods as well
 * 
 * 2. Abstract method: can only be declared inside abstract class. All abstract methods of an 
 * abstract class needs to be overridden by child class or child class itself needs
 * to be declared abstract.Abstract methods don't have method body*/

//abstraction example
abstract class AbstractExample{
	abstract void abstractMethod();
	
	void nonAbstractMethod() {
		System.out.println("Non abstract method of parent class");
	}
}

class AbstractExampleChild extends AbstractExample{
	void abstractMethod() {
		System.out.println("Abstract method overridden");
	}
}
public class Abstraction {
public static void main(String[] args) {
	//creating AbstractExampleChild class object
	AbstractExampleChild a = new AbstractExampleChild();
	a.abstractMethod();
	a.nonAbstractMethod();
}
}
