package codegnan.Loops;
import java.util.*;
public class numtobinary {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int res=0;
	while(n!=0) {
		int rem=n%2;
		res=rem +res;
		n=n/2;
	}
	System.out.println(res);
 }
}
