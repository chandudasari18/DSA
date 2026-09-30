/*Print even numbers from 1 to 50 using a  loop.*/

package codegnan.Loops;
import java.util.*;
public class Even {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the num : ");
	int num = sc.nextInt();
	while(num<=50) {
		if(num%2==0) {
			System.out.println(num);
		}
		num++;
	}
}
}


