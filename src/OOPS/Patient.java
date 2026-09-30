package OOPS;

public class Patient {
	int PatientID;
	String PatientName;
	String Disease;
	double Price;
	
	Patient(int PatientID) {
		this.PatientID=PatientID;
		System.out.println("Patient is Recieved \nPatientID:" + PatientID);
	}
	public Patient(int PatientID,String PatientName) {
		this(PatientID);
		this.PatientName=PatientName;
		System.out.println("Patient Name : "+ PatientName);
	}
	public Patient(int PatientID,String PatientName,String Disease) {
		this(PatientID,PatientName);
		
		this.Disease=Disease;
		System.out.println("Disease : "+ Disease);
	}
	public Patient(int PatientID,String PatientName,String Disease,double Price) {
		this(PatientID,PatientName,Disease);
		this.Price=Price;
		System.out.println("Total Bill : "+Price);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1 = new Patient(101, "Rahul", "Fever", 2500);
		
	}

}
