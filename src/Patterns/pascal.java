package Patterns;
import java.util.*;
public class pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val=1;
		int space = n-val;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			int num=1;
			for(int k=1;k<=val;k++) {
				System.out.print(num+ " ");
				num=num*(i-k)/k;
			}
			System.out.println();
			val++;
			space--;
		}
	}

}
