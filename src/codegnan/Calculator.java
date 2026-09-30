/*Accept
First number
Second number
Operator (+, -, *, /, %)
Example:
Enter first number: 20
Enter second number: 5
Enter operator: *
Using switch-case, perform the selected operation.
If an invalid operator is entered, print:
Invalid Operator
*/

package codegnan;
import java.util.*;
public class Calculator {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 1st number : ");
	int n1 = sc.nextInt();
	System.out.print("Enter 2nd number : ");
	int n2 = sc.nextInt();
	System.out.print("Enter the operation you want (+, -, *, /, %) : \n");
	char c = sc.next().charAt(0);
	switch(c) {
	case '+' : System.out.println(n1 + n2 ); break;
	case '-' : System.out.println( n1 - n2 ); break;
	case '*' : System.out.println( n1 * n2 ); break;
	case '/' : System.out.println( n1 / n2 ); break;
	case '%' : System.out.println( n1 % n2 ); break;
	default : System.out.println("Envalid operator ");
	}
 }
}
