package DSA;

public class demo {
	static {
		System.out.println("hey.... i  am static block -1 ");
	}
	static {
		System.out.println("Hey ... i am static block-2");
	}
	public demo(){
		System.out.println("Hey you forget me.. hummm-3");
	}
	{
		System.out.println("ho you setting aaaa -4");
	}
	public static void main(String args[]) {
		System.out.println("Hey i am main method");
		demo d= new demo();
	}
}
