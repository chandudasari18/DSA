package Encapsulation;

public class bank {
	private int empid;
	private String name;
	private String position;
	private long phoneNumber;

	public int getempid() {
		return empid;
	}
	public String getname() {
		return name;
	}
	public String getposition() {
		return position;
	}
	public long getphoneNumber() {
		return phoneNumber;
	}
	public void setempid(int empid) {
		if(empid>0) {
			this.empid=empid;
		}
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setposition(String position) {
		this.position=position;
	}
	public void setphoneNumber(long phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank e =new bank();
		e.setempid(101);
		
		e.setname("siva");
		e.setposition("manager");
		e.setphoneNumber(789456123);
		System.out.println(e.getempid());
		System.out.println(e.getname());
		System.out.println(e.getposition());
		System.out.println(e.getphoneNumber());
		
		
		
	}

}
