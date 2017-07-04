package estore;

public class Mobilephones extends Electronics{
	private String charger;
	public String getCharger() {
		return charger;
	}
	
	public void setCharger(String charger) {
		this.charger = charger;
	}
	
	public String getHeadphones() {
		return headphones;
	}
	
	public void setHeadphones(String headphones) {
		this.headphones = headphones;
	}
	
	private String headphones;
	
public  void warrantymob()
	                          {
		                        int warrantymob=10;
		                        System.out.println("warranty of mobilephones is :" +warrantymob);
	                            }
	
public void mobtax()
	                          {
		                        super.Tax();
	                            }


}
