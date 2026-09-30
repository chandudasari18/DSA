package DSA;
import java.util.*;

public class Scanemp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Emp id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Emp name: ");
        String name = sc.nextLine();

        System.out.print("Enter Emp full name: ");
        String fullname = sc.nextLine();

        System.out.print("Enter Emp Marital Status (Married/Single): ");
        String marital = sc.nextLine();

        System.out.print("Enter Emp Salary: ");
        double salary = sc.nextDouble();

        sc.nextLine();
        System.out.print("Enter Emp Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Emp ATM pin (4 digits): ");
        int pin = sc.nextInt();

        System.out.print("Enter Emp Annual salary: ");
        double annualSalary = sc.nextDouble();

        System.out.print("Enter Emp increment: ");
        double increment = sc.nextDouble();

        System.out.print("Enter Emp height (in meters): ");
        float height = sc.nextFloat();

        System.out.print("Enter Emp phone number (10 digits): ");
        long phoneNumber = sc.nextLong();

        System.out.print("Enter Emp Aadhar Number (12 digits): ");
        long aadhar = sc.nextLong();

        System.out.print("Enter Emp Present or Absent (true/false): ");
        boolean status = sc.nextBoolean();

        System.out.println("\n--- Employee Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Full Name: " + fullname);
        System.out.println("Marital Status: " + marital);
        System.out.println("Salary: " + salary);
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Increment: " + increment);
        System.out.println("Address: " + address);
        System.out.println("ATM Pin: " + pin);
        System.out.println("Height: " + height + " m");
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Aadhar Number: " + aadhar);
        System.out.println("Present Status: " + status);

        if (id <= 0) System.out.println("Invalid ID.");
        if (name.trim().isEmpty()) System.out.println("Name cannot be empty.");
        if (!marital.equalsIgnoreCase("Married") && !marital.equalsIgnoreCase("Single"))
            System.out.println("Invalid marital status.");
        if (salary < 0 || annualSalary < 0) System.out.println("Salary cannot be negative.");
        if (String.valueOf(pin).length() != 4) System.out.println("Invalid ATM pin.");
        if (String.valueOf(phoneNumber).length() != 10) System.out.println("Invalid phone number.");
        if (String.valueOf(aadhar).length() != 12) System.out.println("Invalid Aadhar number.");

        sc.close();
    }
}

