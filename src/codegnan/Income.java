/*Income Tax Calculator
Read:
Annual Income
Requirements:
Calculate the tax slab:
Up to ₹4,00,000 → No Tax
₹4,00,001 – ₹8,00,000 → 5%
₹8,00,001 – ₹12,00,000 → 10%
₹12,00,001 – ₹20,00,000 → 20%
Above ₹20,00,000 → 30%
Display the applicable tax percentage.
*/
package codegnan;
import java.util.Scanner;
public class Income {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Annual Income : ");
		int income =sc.nextInt();
		if(income == 400000) {
			System.out.println("No Tax");
		}else if(income == 400001-800000) {
			System.out.println("5%");
		}else if(income == 800001-1200000) {
			System.out.println("10%");
		}else if(income == 1200001-2000000) {
			System.out.println("20%");
		}else {
			System.out.println("30%");
		}
	  }
}