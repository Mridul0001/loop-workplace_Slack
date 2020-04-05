/*Write a program to demonstrate use of 'this' keyword in JAVA.
 * Mridul Mahajan*/
package basics;

import java.util.Scanner;

/*this is a reference variable that refers to the current object.

*Note : only first three implementations are required for scope of this programming
        series
1. this can be used to refer current class instance variable.
2. this can be used to invoke current class method (implicitly)
3. this() can be used to invoke current class constructor.
4. this can be passed as an argument in the method call.
5. this can be passed as argument in the constructor call.
6. this can be used to return the current class instance from the method.*/

class This{
	int a;  //instance variable of current class
	This(){
		System.out.println("current class constructor");
	}
	This(int a){
		this();       // invoking current class constructor using this
		this.a = a;   // referring current class variable using this
	}
	void thisMethod() {
		System.out.println("Current class variable: " + a);
		System.out.println("current class method");
	}
	void m() {
		
		this.thisMethod();  //invoking current class method using this keyword
	}
}
public class ThisKeyword {
public static void main(String[] args) {
	This t = new This(10);
	t.m();
}
}

