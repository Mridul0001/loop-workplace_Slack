/*Write a program to show hierarchical inheritance in JAVA.
 * Mridul Mahajan*/
package basics;

/*Hierarchical inheritance refers to child parent relationship where more than one 
 *classes extends a single class. For example, Class B extends class A and class C
 *also extends class A*/

//hierarchical inheritance example
class D{
	void methodA() {
		System.out.println("Parent class method");
	}
}
class E extends D{
	void callParent() {methodA();}
}
class F extends D{
	void callParent() {methodA();}
}

public class HierarchicalInheritance {
public static void main(String[] args) {
	//creating E and F class objects
	E e = new E();
	F f = new F();
	
	//calling callParent() method of E and F
	e.callParent();
	f.callParent();
}
}
