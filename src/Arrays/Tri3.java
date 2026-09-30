package Arrays;
import java.util.*;
public class Tri3 {
public static void main(String args[]) {
	//Scanner sc = new Scanner(System.in);
	int n = 5;
	for(int i=1;i<=n;i++) {
		int space=n-i;
		for(int k=0;k<space;k++) {
			System.out.print(" ");
		}
		for(int j=0;j<2*i-1;j++) {
			System.out.print("*");
		}
		System.out.println( );
	}
}
}
