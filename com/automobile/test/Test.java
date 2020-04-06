/*Problem - 34, 35
 * Mridul Mahajan*/
package com.automobile.test;
import com.automobile.twowheeler.*;
import com.automobile.fourwheeler.*;
public class Test {
public static void main(String[] args) {
	Hero hero=new Hero();
	Honda honda=new Honda();
	Logan logan=new Logan();
	Ford ford=new Ford();
	
	System.out.println("Hero class methods");
	System.out.println(hero.getModelName());
	System.out.println(hero.getRegistrationNumber());
	System.out.println(hero.getOwnerName());
	System.out.println(hero.getSpeed());
	hero.radio();
	
	System.out.println("Honda class methods");
	System.out.println(honda.getModelName());
	System.out.println(honda.getRegistrationNumber());
	System.out.println(honda.getOwnerName());
	System.out.println(honda.getSpeed());
	honda.cdPlayer();
	
	System.out.println("Logan class methods");
	System.out.println(logan.getModelName());
	System.out.println(logan.getRegistrationNumber());
	System.out.println(logan.getOwnerName());
	System.out.println(logan.speed());
	logan.gps();
	
	System.out.println("Ford class methods");
	System.out.println(ford.getModelName());
	System.out.println(ford.getRegistrationNumber());
	System.out.println(ford.getOwnerName());
	System.out.println(ford.speed());
	ford.tempControl();
}
}
