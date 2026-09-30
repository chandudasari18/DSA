/* Print Fibonacci series up to N terms using a for loop.
   (Input: N=7, Output: 0, 1, 1, 2, 3, 5, 8) */

package codegnan.Loops;
import java.util.*;

public class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
