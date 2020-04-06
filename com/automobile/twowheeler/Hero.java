/*Problem - 34, 35
 * Mridul Mahajan*/
package com.automobile.twowheeler;
public class Hero extends com.automobile.Vehicle{

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "ABC123";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "0001";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "XYZ";
	}
	public int getSpeed() {
		return 40;
	}
	public void radio() {
		System.out.println("This method controls the radio");
	}
}
