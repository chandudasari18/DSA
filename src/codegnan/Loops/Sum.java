
/*Find the sum of digits of a number using a  loop.
 (Input: 123, Output: 6)
*/

package codegnan.Loops;
import java.util.*;
public class Sum {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();
	int sum=0;
	while (n != 0) {
        int a = n % 10;   
        sum = sum + a;    
        n = n / 10;           
    }
	System.out.println(sum);
}
}
