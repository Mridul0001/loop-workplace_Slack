/*Write a program to show single inheritence in JAVA.
 * Mridul Mahajan*/
package basics;

/*Inheritance is the process by which one class acquires properties and functionalities
 * of another class
 * 
 * Single Level inheritance - It refers to parent child relationship where one class
 * 							  extends the another class*/

class Parent{ // parent class
	void parentMethod() {
		System.out.println("Parent class method");
	}
}
public class SingleInheritance extends Parent{ // child class
public static void main(String[] args) {
	SingleInheritance s = new SingleInheritance();
	s.parentMethod(); // calling parent method with child object
	
	// it happened because child class constructor automatically invokes parent class default constructor
}
}
