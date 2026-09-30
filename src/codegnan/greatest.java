package codegnan;
import java.util.*;
public class greatest {
	public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the 1st number: ");
	  int n1 = sc.nextInt();
	  System.out.print("Enter the 2nd number: ");
	  int n2 = sc.nextInt();
      System.out.print("Enter the 3rd number: ");
      int n3 = sc.nextInt();
      int res;
      if(n1>n2) {
    	  res=n1;
      }else if(n2> n1) {
    	  res = n2;
      }else if(n3 > n1) {
    	  res = n3;
      }else if(n2 > n3) {
    	  res = n2;
      }else {
    	  res = n3;
      }
      System.out.println("The Greatest number : " +res);
      }
}