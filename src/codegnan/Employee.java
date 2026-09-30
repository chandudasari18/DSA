/*3. Employee Performance Evaluation
Read:
Performance Score (0–100)
Requirements:
Assign ratings:
90–100 → Outstanding
80–89 → Excellent
70–79 → Good
60–69 → Average
Below 60 → Needs Improvement
*/





package codegnan;
import java.util.*;
public class Employee {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter performance Score : ");
	int score =sc.nextInt();
	if(score == 90-100) {
		System.out.println("Outstanding");
	}else if(score == 80-89) {
		System.out.println("Excellent");
	}else if(score == 70-79) {
		System.out.println("Good");
	}else if(score == 60-69) {
		System.out.println("Average");
	}else {
		System.out.println("Need improvemnt");
	}
  }
}
