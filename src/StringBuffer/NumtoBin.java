package StringBuffer;
import java.util.Scanner;
public class NumtoBin {
 public static String convertToBinary(int n) {
	 return Integer.toBinaryString(n);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(convertToBinary(n));
		

	}

}
