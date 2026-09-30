package Arrays;
import java.util.*;
public class SecondMin {
public static void main(String args[]) {
	int arr[] = {1,2,3,5,8,9};
	int min=arr[0];
	int smin=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<min) {
			//smin>min;
			min=arr[i];
		}else if(smin < arr[i] && min>arr[i] ) {
			smin=arr[i];
		}
	}
	System.out.println(smin);
}
}
