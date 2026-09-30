package DSA;

public class FindEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {13,5,33,98,23};
		for(int num:arr) {
			if(num%2==0) {
				System.out.println("found even num :"+num);
				return;
			}
		}
		System.out.println("no element found");
	}

}
