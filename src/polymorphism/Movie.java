package polymorphism;

public class Movie {
	public void bookticket(int ticket) {
		int movieticket=200;
		int totalamount = ticket*movieticket; 
		System.out.println("Total Amount for "+ ticket + "tickets: "+totalamount);
	}
	public void bookticket(int ticket, boolean ispremium) {
		int price =ispremium ? 350:200;
		int totalamount = ticket*price;
		System.out.println("Total Amount for "+ticket+"tickets:" + totalamount);
	}
	public void bookticket(int ticket,boolean ispremium,double discount) {
		int price = ispremium ? 350:200;
		double totalamount=ticket*price;
		double discountamount = totalamount*(discount/100);
		double final_amount = totalamount-discountamount;
		System.out.println("Total amount for "+ticket+ "tickets in discount is : "+final_amount);
		
	}
	public static void main(String args[]) {
		Movie m = new Movie();
		m.bookticket(4);
		m.bookticket(3, true);
		m.bookticket(4,false,20.0);
	}
}
