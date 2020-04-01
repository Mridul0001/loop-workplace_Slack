/*19. Write a program to show how type conversion is done in JAVA.
 * Mridul Mahajan*/
package basics;

public class TypeConversion {
public static void main(String[] args) {
	/*JAVA has two types of type conversion
	 * 1. Widening or Auto conversion
	 * 		->When two data types are compatible
	 *      ->Or when assigning value of smaller data type to bigger one.
	 *      byte -> short -> int -> long -> float -> double
	 *      e.g. int will be auto converted to long but vice versa is not true. 
	 *      For that we use explicit conversion
	 * 2. Narrowing or Explicit conversion
	 *      ->This is useful for incompatible data types where automatic conversion cannot be done.
	 *      ->Here, target-type specifies the desired type to convert the specified value to.
	 * */
	
	//auto conversion
	int i1 = 5;
	long l1 = i1;
	
	System.out.println(l1);
	
	//explicit conversion
	long l2 = 10;
	int i2 =(int)l2;
	
	System.out.println(i2);
}
}
