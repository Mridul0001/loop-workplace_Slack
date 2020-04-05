/*Write a program showing method overloading in JAVA.
 * Mridul Mahajan*/
package basics;

/*Method Overloading is a feature that allows a class to have more than one method having the same name,
 *if their argument lists are different.
 *There are three ways to overload a method
 *1. Number of parameters
 *2. Data type of parameters
 *3. Sequence of data type of parameters*/

//method overloading example
class Overload{
	//method to overload
	void methodOverload() {}
	
	//overloading by number of parameters
	void methodOverload(int a, int b) {
		System.out.println("Sum of a and b is: " +(a+b));
	}
	
	//overloading by data type of parameters
	void methodOverload(int a, float b) {
		System.out.println("Difference of a and b is:" +(a-b));
	}
	
	//overloading by sequence of data type of parameters
	void methodOverload(float a, int b) {
		System.out.println("Difference of a and b is:" +(a-b));
	}
}
public class MethodOverloading {
public static void main(String[] args) {
	//creating object of Overload class
	Overload o = new Overload();
	o.methodOverload(1, 1);  //calling method with same data type
	o.methodOverload(5, 2.5f); //calling method with different data type
	o.methodOverload(2.5f, 5); //calling method with changed sequence of data type
}
}
