
/*Mobile 1 (Default Constructor)
--------------------------------
Mobile ID : 1001
Brand     : Samsung
Model     : Galaxy A35
Price     : 28000.0

Mobile 2 (Parameterized Constructor)
------------------------------------
Mobile ID : 1002
Brand     : OnePlus
Model     : Nord CE 5
Price     : 24999.0

Mobile 3 (Copy Constructor)
---------------------------
Mobile ID : 1002
Brand     : OnePlus
Model     : Nord CE 5
Price     : 24999.0

====================================================
After Updating the Price of Mobile 3
====================================================

Mobile 2 Details
----------------
Mobile ID : 1002
Brand     : OnePlus
Model     : Nord CE 5
Price     : 24999.0

Mobile 3 Details
----------------
Mobile ID : 1002
Brand     : OnePlus
Model     : Nord CE 5
Price     : 23000.0

*/

package OOPS;

public class Mobile {
	int MobileID;
	String Brand;
	String Model;
	double Price;
	public Mobile(int MMobileID,String MBrand,String MModel,double MPrice){
		MobileID=MMobileID;
		Brand=MBrand;
		Model=MModel;
		Price=MPrice;
		
		
	}
	public Mobile(Mobile M1) {
		MobileID=M1.MobileID;
		Model=M1.Model;
		Brand=M1.Brand;
		Price=M1.Price;
	}
	public void display() {
		System.out.println("Mobile ID : "+ MobileID);
		System.out.println("Brand : "+ Brand);
		System.out.println("Model : "+ Model);
		System.out.println("Price : "+ Price);
	}
	public static void main(String args[]) {
		Mobile M1=new Mobile(1001,"Samsung","Galaxy A35",28000);
		System.out.println("Mobile M1 Details");
		M1.display();
	}
		
}
