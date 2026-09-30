/* Food Ordering System
Display the following menu:
1. Pizza
2. Burger
3. Sandwich
4. Biryani
5. Coffee
Take the user's choice.
Using switch-case, display:
Item name
Price
Example:
Burger
Price = ₹120
If the choice is invalid, print:
Item Not Available

*/

package codegnan;
import java.util.*;
public class Food {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Food MENU\n");
	System.out.print("1. Pizza\n");
	System.out.print("2.Burger\n");
	System.out.print("3.Sandwich\n");
	System.out.print("5. Biryani\n");
	System.out.print("4.Coffee\n");
	System.out.print("Enter your Choice : ");
	int n=sc.nextInt();
	switch(n) {
	   case 1 : System.out.println("Your Pizza Price is ₹250"); break;
	   case 2 : System.out.println("Your Burger Price is ₹250"); break;
	   case 3 : System.out.println("Your sandwich Price is ₹250"); break;
	   case 4 : System.out.println( "Your coffee Price is ₹250"); break;
	   case 5 : System.out.println( "Your Biryani Price is ₹250"); break;
	   default : System.out.println("Invalid Choice");
	}	
 }
}
