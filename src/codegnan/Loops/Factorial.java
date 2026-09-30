/*Find the factorial of a number using a  loop.
 (Input: N, Output: N! factorial)*/

package codegnan.Loops;
import java.util.*;
public class Factorial {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter num : ");
	int num = sc.nextInt();
	int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	System.out.println(fact);
}
}
