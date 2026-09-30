/*Find the sum of the first N natural numbers using a  loop.
 (Input: N, Output: Sum of first N numbers)
*/

package codegnan.Loops;
import java.util.*; 
public class SumofFirst {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number : ");
	int n = sc.nextInt();
	int sum=0;
	for(int i =1;i<=n;i++) {
		if(i%2==0) {
		sum = sum+i;
		}
	}
	System.out.println(sum);
 }
}
