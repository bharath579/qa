package estore;

public class Airconditioners extends Electronics {
	private int workingspeed;
	public int getWorkingspeed() {
		return workingspeed;
	}
	
	public void setWorkingspeed(int workingspeed) {
		this.workingspeed = workingspeed;
	}
	
	public int getManufactureyear() {
		return manufactureyear;
	}
	
	public void setManufactureyear(int manufactureyear) {
		this.manufactureyear = manufactureyear;
	}
	
	private int manufactureyear;
	
public  void warrantyair()
	                            {
		                            int warrantyair=11;
		                            System.out.println("warranty of Airconditioners is :" +warrantyair);
	                               }
	
public void airtax()
	                           {
		                          super.Tax();
	                              }


}
