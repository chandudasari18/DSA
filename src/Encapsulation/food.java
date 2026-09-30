/*2. Food Delivery App
Scenario: A food delivery application manages restaurant orders.
Create an Order class with private variables:
orderId
customerName
totalAmount
orderStatus
Requirements:
Total amount cannot be negative.
Status should accept only "Pending", "Preparing", "Delivered", or "Cancelled".
Use getter and setter methods.
*/

package Encapsulation;

public class food {
 private int orderid;
 private String customername;
 private double totalamount;
 private String orderstatus;
 public int getorderid() {
	 return orderid;
 }
 public String getcustomername() {
	 return customername;
 }
 public double gettotalamount() {
	 return totalamount;
 }
 public String getorderstatus() {
	 return orderstatus;
 }
 public void setorderid(int orderid) {
	 this.orderid=orderid;
 }
 public void setcustomername(String customername) {
	 this.customername=customername;
 }
 public void settotalamount(double totalamount) {
	 this.totalamount=totalamount;
 }
 public void setorderstatus(String orderstatus) {
	 this.orderstatus=orderstatus;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		food f= new food();
		f.setorderid(101);
		f.setcustomername("Chandu");
		f.settotalamount(100.5);
		f.setorderstatus("Packed");
		System.out.println(f.getorderid());
		System.out.println(f.getcustomername());
		System.out.println(f.gettotalamount());
		System.out.println(f.getorderstatus());
	}

}
