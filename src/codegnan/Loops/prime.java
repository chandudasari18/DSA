
/*Check if a number is prime using a  loop.
 (Input: 7, Output: Prime)
*/

package codegnan.Loops;
import java.util.*;
public class prime {
public static void main(String args) {
	 Scanner sc = new Scanner(System.in);
     int n= sc.nextInt();
     boolean isPrime=true;
     for(int i=2;i<=n/2;i++){
         if(n%i==0){
             isPrime=false;
             break;
         }
     }
     if(isPrime){
         System.out.println(n+" is prime number");
     }else{
          System.out.println(n+" is not prime number");
     }
 }
}
