package estore;

public class Fridges extends Electronics{

	private String company;
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getYearmade() {
		return yearmade;
	}
	
	public void setYearmade(String yearmade) {
		this.yearmade = yearmade;
	}
	
	private  String yearmade;


public  void warrantyfri()
                                 {
	                               int warrantyfri=7;
	                               System.out.println("warranty of fridge is :" +warrantyfri);
                                    }
public void fridgetax()
                                {
	                              super.Tax();
                                  }
}
