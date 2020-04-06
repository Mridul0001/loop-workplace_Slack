/*Problem - 34, 35
 * Mridul Mahajan*/
package com.automobile.fourwheeler;

public class Logan extends com.automobile.Vehicle{

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "ABC000";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "000001";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "XYZ456";
	}
	public int speed() {
		return 100;
	}
	public void gps() {
		System.out.println("This method allows to control gps");
	}
}
