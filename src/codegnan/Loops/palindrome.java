
/*Check if a number is a palindrome using a  loop.
 (Input: 121, Output: Palindrome)
*/

package codegnan.Loops;
import java.util.*;
public class palindrome {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int n = sc.nextInt();
	int rev = 0;
	int ori=n;
	while(n!=0) {
		int r = n%10;
		rev = rev * 10 + r;
		n=n/10;
	}
	if(rev == ori) {
		System.out.println("palindrome");
	}else {
		System.out.print("Not a palindrome");
	}
	
}
}
