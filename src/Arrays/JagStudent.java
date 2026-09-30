
/*Jagged Array Practice
Task 4: Student Marks
Create a jagged array for 4 students.
Student 1 has 2 subjects.
Student 2 has 4 subjects.
Student 3 has 3 subjects.
Student 4 has 5 subjects.
Read all marks and display them.
*/

package Arrays;
import java.util.*;

public class JagStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Jagged array for 4 students
        int[][] arr = new int[4][];

        // Fixed number of subjects
        arr[0] = new int[2]; // Student 1
        arr[1] = new int[4]; // Student 2
        arr[2] = new int[3]; // Student 3
        arr[3] = new int[5]; // Student 4

        // Read marks
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Display marks
        System.out.println("\nStudent Marks:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}