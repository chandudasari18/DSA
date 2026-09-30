/*Print odd numbers from 1 to 50 using a  loop.
*/
package codegnan.Loops;
import java.util.*;
public class Odd {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int i=1;
	while(i<=50) {
		if(i%2==1) {
			System.out.println(i);
		}
		i++;
	}
 }
}
