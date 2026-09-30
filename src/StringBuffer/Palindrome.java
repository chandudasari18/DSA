package StringBuffer;

public class Palindrome {

    public static void main(String[] args) {
        String original = "aba";
        
        StringBuffer sb = new StringBuffer(original);
        String reversed = sb.reverse().toString();
        
        if(original.equals(reversed)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
