/*2. College Admission System
Read:
Entrance Exam Rank
Intermediate Percentage
Age
Requirements:
Students with rank ≤ 1000 and percentage ≥ 75% are eligible.
If eligible, check whether the age is 17 years or above.
If all conditions are satisfied, display:

Admission Confirmed

Otherwise, display appropriate messages.
*/

package codegnan;
import java.util.*;

public class Admission {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Exam Rank : ");
        int rank = sc.nextInt();

        System.out.print("Enter inter percentage : ");
        double percentage = sc.nextDouble();

        System.out.print("Enter age : ");
        int age = sc.nextInt();

        if (rank <= 1000 && percentage >= 75) {
            if (age >= 17) {
                System.out.println("Admission Confirmed");
            } else {
                System.out.println("Eligible, but age requirement not met");
            }
        } else {
            System.out.println("Not Eligible");
        }
    }
}

