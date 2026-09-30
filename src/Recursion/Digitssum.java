package Recursion;

public class Digitssum {
	static int digits(int n) {
		if(n==0) {
			return 0;
		}
			return(n%10)+digits(n/10);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		int res=digits(n);
		System.out.println(res);
	}

}
