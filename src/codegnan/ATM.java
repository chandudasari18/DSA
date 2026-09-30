/* ATM Cash Withdrawal
Read:
PIN
Correct PIN
Balance
Withdrawal Amount
Requirements:
Verify the PIN.
If the PIN is correct, check whether sufficient balance is available.
If successful, display:

Collect Your Cash

Otherwise, display appropriate messages.
*/

package codegnan;
import java.util.*;
public class ATM {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Pin : ");
	int pin = sc.nextInt();
	System.out.print("Enter Balance : ");
	int balance = sc.nextInt();
	System.out.print("Enter withdraww Amount : ");
	int withdraw = sc.nextInt();
	int upin = 7929;
	if(pin==upin) {
		if(balance >= withdraw ) {
			System.out.println("Succesful");
		}
	}else {
		System.out.println("Enter valid pin or amount");
	}
 }
}
