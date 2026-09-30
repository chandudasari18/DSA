package OOPS;

public class Food {
	int OrderID;
	String Restuarant;
	String Item;
	String Address;
	
	Food(int OrderID) {
		this.OrderID=OrderID;
		System.out.println("Food Order Started \nOrderID:" + OrderID);
	}
	public Food(int OrderID,String Restuarant) {
		this(OrderID);
		this.Restuarant=Restuarant;
		System.out.println("Restuarant : "+ Restuarant);
	}
	public Food(int OrderID,String Restuarant,String Item) {
		this(OrderID,Restuarant);
		
		this.Item=Item;
		System.out.println("Item : "+ Item);
	}
	public Food(int OrderID,String Restuarant,String Item,String Address) {
		this(OrderID,Restuarant,Item);
		this.Address=Address;
		System.out.println("Address : "+Address);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f = new Food(1001, "Paradise", "Chicken Biryani", "Hyderabad");

		
	}

}
