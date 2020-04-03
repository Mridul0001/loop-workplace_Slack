/*Write a program to demonstrate the role of 'static' keyword in JAVA.
 * Mridul Mahajan*/
package basics;

/*static keyword in JAVA can be used in four ways
 * 1. static variables : a single copy of variable is created and shared among all objects
 * 2. static methods : can be accessed without creating object of class.
 *    *Note - static methods can only directly call static methods.
 *    		- can only directly access static data members.
 *    		- cannot refer to this and super in any way.
 * 3. static block : used to initialize static variables and 
 * 					 executed only once when class is loaded.
 * 	  *Note - static block and static variables are executed in order 
 * 		      they are present in a program.
 * 4. static nested classes : only inner classes can be declared as static.
 * 	  *Note - A static nested class may be instantiated without instantiating its outer class.
			- A static class can access only the static members of the outer class.*/

class Outer{
	//static variable example
	static int a = 10;
	static int b;
	
	//static block example
	static {
		System.out.println("this static block is used to initialize value of "
				+ "static variable b");
		b=a*a;
	}
	
	//static nested class example
	static class Inner{
		
		//static method example
		static void innerMethod() {
			System.out.println("static class method");
		}
	}
}
public class StaticKeyword {
public static void main(String[] args) {
	Outer.Inner.innerMethod(); // accessed static method of inner class without creating object
							   // also accessed inner class without instantiating outer class
	
	Outer o1 = new Outer();	   // static block will be executed and value of b will be updated
	System.out.println("Value of b is: "+o1.b);
	Outer o2 = new Outer();	   // static block will not be executed this time
	System.out.println("Value of b is: "+o2.b);  // value of b was updated for every object
}
}
