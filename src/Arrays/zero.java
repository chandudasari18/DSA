package Arrays;

import java.util.Scanner;

public class zero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int a = 0;

        // Move non-zero elements to the front
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[a] = arr[i];
                a++;
            }
        }

        // Fill remaining places with zeros
        while(a < n) {
            arr[a] = 0;
            a++;
        }

        // Print the array
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}