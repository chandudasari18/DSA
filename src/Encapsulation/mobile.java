/*1. Mobile Recharge System
Scenario: A telecom company processes mobile recharges.
Create a Recharge class with private variables:
mobileNumber
operatorName
rechargeAmount
Requirements:
Recharge amount should be at least ₹10.
Mobile number should contain exactly 10 digits.
Use getter and setter methods.
*/

package Encapsulation;

public class mobile {
	private long mobilenumber;
	private String operator;
	private int rechargeamount;
	public long getmobilenumber() {
		return mobilenumber;
	}
	public String getoperator() {
		return operator;
	}
	public int getrechargeamount() {
		return rechargeamount;
	}
	public void setmobilenumber(long mobilenumber) {
		this.mobilenumber=mobilenumber;
	}
	public void setoperator(String operator) {
		this.operator=operator;
	}
	public void setrechargeamount(int rechargeamount) {
		this.rechargeamount=rechargeamount;
	}
	public static void main(String args[]) {
		mobile m=new mobile();
		m.setmobilenumber(7894561230l);
		m.setoperator("Airtel");
		m.setrechargeamount(99);
		System.out.println("mobile number is : "+ m.getmobilenumber());
		System.out.println("Recharge amount is : " + m.getrechargeamount());
		
	}
}
