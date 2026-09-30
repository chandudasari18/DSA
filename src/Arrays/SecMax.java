package Arrays;
import java.util.*;
public class SecMax {
public static void main(String args[]) {
	int arr[] = {1,2,3,5,8,9};
	int max=arr[0];
	int smax=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>max) {
			smax=max;
			max=arr[i];
		}else if(arr[i]>smax && max<arr[i]){
			smax=arr[i];
		}
	}
	System.out.println(smax);
}
}
