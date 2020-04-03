/*Write a program to show multilevel inheritence in JAVA.
 * Mridul Mahajan*/
package basics;

/*Multilevel inheritance refers to child and parent relationship where a class 
 * extends the child class. e.g. Class C extends Class B and Class B extends Class A*/
class A{
	int a = 10;
}
class B extends A{
	void abc() {
		System.out.println("B class method");
		System.out.println("A class variable: " + a);
	}
}
class C extends B{
	void xyz() {
		System.out.println("C class method");
		abc();
	}
}
public class MultilevelInheritance {
public static void main(String[] args) {
	C c = new C(); //creating object of class C
	c.xyz(); // calling xyz method of C class
}
}
