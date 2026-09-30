/*Hospital Patient Priority
Read:
Age
Body Temperature
Oxygen Level
Requirements:
If oxygen level is below 90, mark as:

Emergency

Otherwise, if temperature is above 102 and age is above 60:

High Priority

Otherwise:

Normal Priority
*/

package codegnan;
import java.util.*;

public class patient {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter age : ");
        int age = sc.nextInt();

        System.out.print("Enter Body Temp : ");
        int temp = sc.nextInt();

        System.out.print("Enter oxygen level : ");
        int oxygen = sc.nextInt();

       

        if (oxygen <= 90 ) {
                System.out.println("Emergency");
            } else if(temp >= 102 && age >= 60){
                System.out.println("High Priority");
            }else {
            	System.out.println("Normal priority");
            }
        
    }
}


