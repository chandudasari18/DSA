/*Print the multiplication table of a given number using a  loop.
 (Input: N, Output: Table of N)
*/

package codegnan.Loops;
import java.util.*;
public class Multiplication {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number : ");
	int n = sc.nextInt();
	for(int i=1 ; i<=10;i++) {
		System.out.println(n + " x " + i + " = " + (n * i));
	}
 }
}
