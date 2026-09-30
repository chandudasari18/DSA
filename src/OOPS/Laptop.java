
/*Create a class named Laptop with the following instance variables:
brand
model
price
Requirements
Create a parameterized constructor to initialize the laptop details.
Create a copy constructor that copies the values from another Laptop object.
Create a display() method.
Create one laptop object using the parameterized constructor.
Create another laptop object using the copy constructor.
Display both objects.

*/

package OOPS;

public class Laptop {
	String model;
	String brand;
	Double price;
	 
	public Laptop(String Lbrand,String Lmodel,double Lprice) {
		brand=Lbrand;
		model=Lbrand;
		price=Lprice;
	}
	public Laptop(Laptop L1) {
		brand=L1.brand;
		model=L1.model;
		price=L1.price;
	}
	public void display() {
		System.out.println("Brand : "+ brand);
		System.out.println("Model : "+ model);
		System.out.println("Price : "+ price);
		System.out.println();
	}
	public static void main(String args[]) {
		Laptop L1=new Laptop("Dell","Inspiron 15",62000);
		Laptop L2=new Laptop(L1);
		System.out.println("Laptop 1");
		System.out.println();
		L1.display();
		System.out.println("Laptop 2");
		System.out.println();
		L2.display();
	}

}
