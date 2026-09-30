package codegnan;
import java.util.*;

public class BankAccount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter the transfer Amount: ");
        double transfer = sc.nextDouble();

        System.out.print("Is Account active? (true/false): ");
        boolean account = sc.nextBoolean();

        if (account) {  
            if (balance >= transfer) {
                System.out.println("Transaction Successful");
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {  
            System.out.println("Account Blocked");
        }
    }
}
