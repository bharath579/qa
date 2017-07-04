package estore;

public class Computers extends Electronics{
	private int speed;
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getCreator() {
		return creator;
	}
	
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	private String creator;
	
public  void warrantycom()
	                       {
		                      int warrantycom=9;
		                      System.out.println("warranty of computer is :" +warrantycom);
	                         }
	
public void comtax()
	                       {
		                     super.Tax();
	                         }

}
