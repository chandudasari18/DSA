/*7. Smart Door Security System
Read:
Fingerprint Matched (true/false)
Face Recognized (true/false)
Security PIN
Requirements:
Check the fingerprint first.
If matched, verify face recognition.
If face recognition is successful, verify the PIN.
Display appropriate messages for every failure.
*/

package codegnan;
import java.util.*;

public class Smartdoor{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("is Finger matched ? (true/false) : ");
        boolean finger = sc.nextBoolean();

        System.out.print("is Face matched ? (true/false) : ");
        boolean face = sc.nextBoolean();

        System.out.print("Enter Security pin : ");
        int pin = sc.nextInt();
        int upin = 0000;

        if (finger == true && face == true ) {
            if (upin == pin) {
                System.out.println("Successful");
            } else {
                System.out.println("Try Again");
            }
        }
    }
}

