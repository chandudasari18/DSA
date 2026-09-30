/*
5. Online Shopping Discount
Read:
Purchase Amount
Premium Member (true/false)
Requirements:
Premium members receive:
20% discount for purchases above ₹10,000
10% discount for purchases above ₹5,000
Regular customers receive:
10% discount for purchases above ₹10,000
5% discount for purchases above ₹5,000
Otherwise, no discount.
*/


package codegnan;
import java.util.*;
public class shopping {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter purchase Amount : ");
	int amount = sc.nextInt();
	System.out.print("Is Premium Meber ? (true/false)");
	boolean member = sc.nextBoolean();
	if(member == true) {
		if(amount>=10000) {
			System.out.println("20% discount");
		}else if (amount >= 5000) {
			System.out.println("10% discount");
		}
	}else if(amount >= 10000) {
		System.out.println("10% discount");
	}else if( amount >= 5000){
		System.out.print("5% discount");
	}else {
		System.out.println("NO Discount");
	}
 }
}
