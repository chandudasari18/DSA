
/*Check if a number is an Armstrong number using a while loop.
 (Input: 153, Output: Armstrong Number)
 (153 = 1³ + 5³ + 3³)*/


package codegnan.Loops;
import java.util.*;
public class armstrong {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sum=0;
	int o=n;
	while(n!=0) {
		int a = n%10;
		sum=(a*a*a)+sum;
		n=n/10;
	}
	if( sum == o) {
	System.out.println("Armstrong Number");
	}
	else {
		System.out.println("Not an armstrong number");
	}
	
		
}
}
