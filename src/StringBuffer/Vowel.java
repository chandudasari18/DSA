package StringBuffer;

public class Vowel {
	public static void main(String ar[]) {
		StringBuffer sb= new StringBuffer();
		sb.append("corejava");
		int count=0;
		
		for(int i=0;i<sb.length();i++) {
			char ch=sb.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
