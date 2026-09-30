	package Arrays;
	import java.util.*;
	public class Trinagle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star=1;
		int space=n-star;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}for(int k=1;k<=star;k++) {
				if(k==star) {
				System.out.print("* ");
				}else {
					System.out.println("* ");
				}
				/*if(k!=star) {
					System.out.print(" ");
				}*/
			}
			System.out.println( );
			star++;
			space--;
			
		}
		
	}
	}
