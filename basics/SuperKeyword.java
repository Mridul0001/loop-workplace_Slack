/*Write a program to demonstrate use of 'super' keyword in JAVA.
 * Mridul Mahajan*/
package basics;

/*super keyword refers to object of immediate parent class
 * 1. To access the data members of parent class when both parent and child class have member with same name
 * 2. To explicitly call the no-arg and parameterized constructor of parent class
 * 3. To access the method of parent class when child class has overridden that method.*/

class SuperExample{ //parent class
	int a = 5;
	SuperExample(){
		System.out.println("This is parent class's constructor, called using super keyword");
	}
	void SuperMethod() {
		System.out.println("This is parent class's method, called using super keyword");
	}
}

class SuperExampleChild extends SuperExample{ //child class  
	int a = 6; //variable with same name as parent class
	public SuperExampleChild() {
		super(); //calling constructor of parent class
		System.out.println("Parent class variable: "+ super.a); // accessing parent class variable
	}
	void SuperMethod() { // parent class method overridden 
		System.out.println("This is child class's method");
		super.SuperMethod();
	}
}
public class SuperKeyword{
public static void main(String[] args) {
	//creating SuperExampleChild class object
	SuperExampleChild s = new SuperExampleChild();
	s.SuperMethod();
}
}
