/*. Grade Description
Accept a grade character from the user.
Possible inputs:
A
B
C
D
F
Using switch-case, display:
A → Excellent
B → Very Good
C → Good
D → Needs Improvement
F → Failed
If the user enters any other character, print:
Invalid Grade
*/

package codegnan;
import java.util.*;
public class GradeDesc {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your Choice : ");
	char ch=sc.next().charAt(0);
	switch(ch) {
	   case 'A' : System.out.println("Excellent"); break;
	   case 'B' : System.out.println("Very Good"); break;
	   case 'C' : System.out.println("Good"); break;
	   case 'D' : System.out.println( "Needs Improvement"); break;
	   case 'F' : System.out.println( "Failed"); break;
	   default : System.out.println("Invalid Grade");
	}
}
}
