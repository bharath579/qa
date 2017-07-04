package estore;

public class Microwaves extends Electronics {
	private int powerconsumption;
	public int getPowerconsumption() {
		return powerconsumption;
	}
	
	public void setPowerconsumption(int powerconsumption) {
		this.powerconsumption = powerconsumption;
	}
	
	public String getMakingyear() {
		return makingyear;
	}
	
	public void setMakingyear(String makingyear) {
		this.makingyear = makingyear;
	}
	
	private String makingyear; 
	
public  void warrantymic()
	                       {
		                      int warrantymic=8;
		                      System.out.println("warranty of Microwave is :" +warrantymic);
	                           }
public void mictax()
	                       {
		                     super.Tax();
	                          }

}
