/*Write a program to show use of interface in JAVA.
 * Mridul Mahajan*/
package abstraction_and_packages;

/*Interfaces are used for full abstraction. Also, unlike class we can implement more
 * than one interface on a single class.
 * Note - All the interface methods are by default abstract and public.
 * 		  Variables declared in interface are public, static and final by default.
 * 		  We can't create instance of interface*/

//interface example
interface Int1{
	int a = 10;
	void abc();
}

interface Int2{
	int b = 20;
	void xyz();
}
public class Interface implements Int1,Int2{ //implementing multiple inheritance in JAVA using interfaces
	public void abc() {  //only method of Int1 interface
		System.out.println("abc() method from interface Int1");
	}
	public void xyz() {  //only method of Int2 interface
		System.out.println("xyz() method from interface Int2");
	}
	public static void main(String[] args) {
		Interface i = new Interface();
		System.out.println("Sum of variables from Int1 and Int2: " +(a+b));
		i.abc();
		i.xyz();
	}
}
