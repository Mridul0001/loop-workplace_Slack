/*Problem - 34, 35
 * Mridul Mahajan*/
package com.automobile.fourwheeler;

public class Ford extends com.automobile.Vehicle{

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "ABC111";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "001";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "XYZ444";
	}
	public int speed() {
		return 90;
	}
	public void tempControl() {
		System.out.println("This method allows to control AC");
	}
}
