
/*Count the number of digits in a number using a  loop.
 (Input: 7865, Output: 4 digits)
*/

package codegnan.Loops;
import java.util.*;
public class count {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n = sc.nextInt();
	int count =0;
	do{
		n=n/10;
		count++;
	}while(n!=0);
	System.out.println(count);
}
}
