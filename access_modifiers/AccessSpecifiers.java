/*Write a program to demonstrate the scope of access specifiers in JAVA.
 * Mridul Mahajan*/
package access_modifiers;

/*The access modifiers in Java specifies the accessibility or scope 
 * of a field, method, constructor, or class.
 * There are four access specifiers in JAVA
 * 1.Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
 * 2.Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
 * 3.Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
 * 4.Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.*/

class PrivateTest{
	private static int a=1; //only accessible within this class
	static int b=2;  //accessible within package
	public static int c=3;  //accessible everywhere
	protected static int d=4; //accessible within package and only by child class outside the package
	//displaying value of private variable
	void display() {
		System.out.println("Private specifiers: " + a);
	}
}
public class AccessSpecifiers extends PrivateTest{
public static void main(String[] args) {
	PrivateTest p = new PrivateTest();
	p.display();
	System.out.println("Default specifiers: " + b); //displaying value of default variable
}
}
