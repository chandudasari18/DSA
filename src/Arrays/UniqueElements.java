package Arrays;
import java.util.*;
public class UniqueElements {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int arr [] = {1,1,7,5,5};
	
	for(int i=0;i<arr.length;i++) {
		int unique = 1;
		for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j] && i!=j) {
				unique++;
			}
		}
		//unique=unique^arr[i]; 
		if(unique==1) {
			System.out.println(arr[i]);
		}
			
		
	}
	//System.out.println(unique);
 }
}
