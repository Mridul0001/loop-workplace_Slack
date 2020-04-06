/*Write a program to show how we can request JVM for garbage collection manually?
 * Mridul Mahajan*/
package basics;

/*The process of removing unused objects from heap memory is known as Garbage collection 
 * and this is a part of memory management in Java. Garbage collection is automatic in JAVA.
 * But we can manually request JVM for garbage collection*/
public class GarbageCollection {
public static void main(String[] args) {
	GarbageCollection g1=new GarbageCollection();
	g1 = null; //as we have assigned null, the object of class is no longer reachable
	
	GarbageCollection g2 = new GarbageCollection();
	GarbageCollection g3 = new GarbageCollection();
	g2 = g3; //we copied reference g3 to g2, hence the object pointed by g2 is no longer reachable
	
	// in above scenarios, Garbage collection must be done
	System.gc(); // requesting JVM for garbage collection
}
@Override
	protected void finalize() throws Throwable { //this method is always invoked when object is destroyed
		// TODO Auto-generated method stub
		System.out.println("Garbage collection performed");
	}
}
