package StringBuffer;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("BALACHANDU");
		int count=0;
		for(int i=0;i<sb.length();i++) {
			char ch=Character.toLowerCase(sb.charAt(i));
			if(ch == 'a' ||ch=='e' || ch=='i' || ch=='o'||ch=='u' ) {
				count++;
			}
		}
		System.out.println(count);
	}



}
