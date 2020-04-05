/*Write a program showing method overriding in JAVA.
 * Mridul Mahajan*/
package basics;

/*Method overriding means declaring a method in sub class which is already present in
 * parent class so that child can give its own implementation to the method.*/

//method overriding example
class Base{
	void methodA() {
		System.out.println("Overridden method of parent class");
	}
	void methodB() {
		System.out.println("Non overridden method of parent class");
	}
}
class Child extends Base{
	void methodA() {
		System.out.println("Overriding method in child class");
	}
}
public class MethodOverriding {
public static void main(String[] args) {
	Base b = new Child();  //parent class reference referring to child class object
	b.methodA();           //this is known as dynamic method dispatch(DMD)
	b.methodB();           //in DMD, we can call all non-overridden methods of parent class
	                       //and overriding methods in base class but can't call newly created methods in base class
}
}
