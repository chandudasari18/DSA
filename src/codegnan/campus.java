/*Campus Placement Eligibility
Read:
CGPA
Number of Backlogs
Communication Score
Aptitude Score
Requirements:
Students with backlogs are not eligible.
If there are no backlogs, check the CGPA.
If CGPA is eligible, check communication and aptitude scores.
Display one of the following:
Eligible for Placement
Eligible for Written Test Only
Not Eligible
*/

package codegnan;
import java.util.*;

public class campus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CGPA : ");
        double CGPA = sc.nextDouble();

        System.out.print("Enter no. of backlogs: ");
        int backlogs = sc.nextInt();

        System.out.print("Enter Communication Score : ");
        int communication = sc.nextInt();

        System.out.print("Enter Aptitude Score : ");
        int aptitude = sc.nextInt();

        if (backlogs > 0) {
            System.out.println("Not Eligible");
        } else {
            if (CGPA >= 7.5) {
                if (communication >= 7 && aptitude >= 7) {
                    System.out.println("Eligible for Placement");
                } else if (communication >= 7 || aptitude >= 7) {
                    System.out.println("Eligible for Written Test Only");
                } else {
                    System.out.println("Not Eligible");
                }
            } else {
                System.out.println("Not Eligible");
            }
        }
    }
}
