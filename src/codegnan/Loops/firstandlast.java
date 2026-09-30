package codegnan.Loops;
import java.util.*;
public class firstandlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int last=n%10;
		int first=n;
		while(first>10) {
			first=first/10;
		}
		System.out.println(first);
		System.out.println(last);
	}

}
