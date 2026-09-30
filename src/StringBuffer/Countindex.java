package StringBuffer;

public class Countindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("JavaJava");
		int count =0;
		for(int i=0;i<sb.length();i++) {
			char ch = sb.charAt(i);
			if(ch=='J') {
				count++;
			}
		}
		System.out.println(count);
	}

}
