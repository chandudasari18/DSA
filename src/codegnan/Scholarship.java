/*6. University Scholarship
Read:
CGPA
Attendance Percentage
Annual Family Income
Requirements:
Scholarship is awarded only if:
CGPA ≥ 8.5
Attendance ≥ 85%
Family income is below ₹3,00,000
Otherwise, display the reason for rejection.
*/

package codegnan;
import java.util.*;
public class Scholarship {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter CGPA : ");
	double CGPA = sc.nextDouble();
	
	System.out.println("Enter Attendance: ");
	double Attendance = sc.nextDouble();
	
	System.out.println("Enter Annual Income : ");
	int income = sc.nextInt();
	
	if(CGPA >= 8.5 && Attendance >= 85) {
		if(income <= 300000) {
			System.out.println("Scholarship is awarded");
		}
	}else {
		System.out.println("Scholarship is not awarded");
	}
	
 }
}
