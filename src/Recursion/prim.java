package Recursion;
import java.util.*;

public class prim {
    
    static boolean prime(int n, int div) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        if (div * div > n) {
            return true; 
        }
        if (n % div == 0) {
            return false; // found a divisor
        }
        return prime(n, div + 1); // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean res = prime(n, 2); // always start divisor at 2
        if (res) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }
}
