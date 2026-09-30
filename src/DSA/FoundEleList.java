package DSA;
import java.util.*;
public class FoundEleList {
public static void main(String args[]) {
	List<String> list = Arrays.asList("pen","paper","Book","pencil");
	String target="book";
	for(int i=0;i<list.size;i++) {
		if(list.get(i)equals(target)) {
			System.out.println("found String :"+i);
			return;
		}
	}
	System.out.println("No element found......");
}
}
