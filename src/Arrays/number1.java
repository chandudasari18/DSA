package Arrays;
import java.util.*;
public class number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=val;j++) {
				System.out.print(j);
			}
			System.out.println( );
			val++;
		}
	}

}
