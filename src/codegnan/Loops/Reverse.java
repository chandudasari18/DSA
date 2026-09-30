/*Reverse a number using a  loop.
 (Input: 12345, Output: 54321)
*/

package codegnan.Loops;
import java.util.*;
public class Reverse {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : " );
	int n=sc.nextInt();
	int rev=0;
	while(n!=0) {
		int r= n%10;
		rev=rev*10+r;
		n=n/10;
	}
	System.out.println(rev);
 }
}
	