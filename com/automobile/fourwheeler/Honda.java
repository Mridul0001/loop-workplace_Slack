/*Problem - 34, 35
 * Mridul Mahajan*/
package com.automobile.fourwheeler;

public class Honda extends com.automobile.Vehicle{

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "ABC789";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "00001";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "PQR";
	}
	public int getSpeed() {
		return 80;
	}
	public void cdPlayer() {
		System.out.println("This method controls the CD Player");
	}

}
