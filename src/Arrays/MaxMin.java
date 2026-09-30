package Arrays;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,5,3,6,4};
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		for(int j=1;j<arr.length;j++) {
			if(arr[j]<min) {
				min=arr[j];
			}
			
		}
		System.out.println("Maximum : " + max);
		System.out.println("Minimum : " + min);
		
	}

}
