package DSA;
import java.util.*;
public class menu  {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("------ Food Menu ------");
	        System.out.println("1. Veg Biryani");
	        System.out.println("2. Biryani Pizza");
	        System.out.println("3. Vegetable Sandwich");
	        System.out.println("-----------------------");

	        System.out.print("Enter your choice (1-3): ");
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("You selected Veg Biryani.");
	                System.out.println("A fragrant rice dish cooked with vegetables and spices.");
	                break;
	            case 2:
	                System.out.println("You selected Biryani Pizza.");
	                System.out.println("A fusion dish combining biryani flavors with cheesy pizza.");
	                break;
	            case 3:
	                System.out.println("You selected Vegetable Sandwich.");
	                System.out.println("A healthy sandwich filled with fresh veggies.");
	                break;
	            default:
	                System.out.println("Invalid choice. Please select between 1 and 3.");
	        }

	        sc.close();
	    }
	}


