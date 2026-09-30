/* ATM Menu System
Write a Java program that displays the following menu:
===== ATM MENU =====
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Mini Statement
5. Exit
Take the user's choice using Scanner.
Using a switch-case, display:
1 → "Your balance is ₹25,000"
2 → "Enter amount to deposit"
3 → "Enter amount to withdraw"
4 → "Displaying mini statement..."
5 → "Thank you for using our ATM."
Any other number → "Invalid Choice"
*/


package codegnan;
import java.util.*;
public class Atmmenu {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("ATM MENU\n");
	System.out.print("1. Check balance\n");
	System.out.print("2.Deposit Money\n");
	System.out.print("3.Withdraw Money\n");
	System.out.print("4. Mini Statement\n");
	System.out.print("5.Exit\n");
	System.out.print("Enter your Choice : ");
	int n=sc.nextInt();
	switch(n) {
	   case 1 : System.out.println("Your balance is ₹25,000"); break;
	   case 2 : System.out.println("Enter amount to deposit"); break;
	   case 3 : System.out.println("Enter amount to withdraw"); break;
	   case 4 : System.out.println( "Displaying mini statement..."); break;
	   case 5 : System.out.println( "Thank you for using our ATM."); break;
	   default : System.out.println("Invalid Choice");
	}
	
 }
}


