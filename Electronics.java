package estore;

import java.util.Scanner;

public class Electronics {
	
private String colour;
public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}

public String getFunction() {
	return function;
}

public void setFunction(String function) {
	this.function = function;
}

public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}
private String function;
private int size;
private int year;

public void Tax()
                       {
	                       double price;
	                       float tax;
	                       double totalprice;
	
	                       Scanner Userinput = new Scanner(System.in);
	
	                       System.out.println("the price of the product is : ");
	                       price = Userinput.nextDouble();
	                       tax = (float)(0.115*price);
	                       totalprice = price + tax;
	                       System.out.println("the total price is :" +totalprice);

}


}
