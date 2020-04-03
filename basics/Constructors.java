/*Write a program showing use of constructors in JAVA.
 * Mridul Mahajan*/
package basics;
/*Constructor initializes the newly created object.
 * Types of constructors in JAVA:
 * 1. Default constructor - When you do not explicitly define a constructor in
 * 							the class then java compiler inserts a default constructor.
 * 							But it is not visible in source code because it exists in .class file
 * 2. no-arg constructor -  When you write a constructor with no arguments in your code
 * 							it's syntax is same as default except its body can contain any code
 * 							and also it is not default since you have written it in your code
 * 3. parameterized constructor - Constructor with parameters
 * 4. copy constructor - It copies value of one object into another
 *    
 * *Note - Constructors are not same as methods because they don't have return type*/

class Test1{}

class Test2{
	int a;
	Test2(){  //no-arg constructor
		System.out.println("no-arg constructor");
	}
	Test2(int a){//parameterized constructor
		this.a=a;
	}
	Test2(Test2 obj){//copy constructor
		this.a = obj.a;
	}
}
public class Constructors {
	public static void main(String[] args) {
		//Creating Test1 class object
		Test1 t1=new Test1(); //default constructor is called
		//Creating Test2 class object
		Test2 no_arg=new Test2(); //object is initialized through no-arg constructor
		Test2 parameterized=new Test2(10); // object is initialized through parameterized constructor
		Test2 copy=new Test2(parameterized);//object is initialized through copy constructor
		
		//Printing value to screen
		System.out.println(parameterized.a);
		System.out.println(copy.a);
		
		//we have different definitions of constructor for a single class here,
		//this is also known as constructor overloading.
	}
}
