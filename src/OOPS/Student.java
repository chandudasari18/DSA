package OOPS;

public class Student {
	int Rollno;
	String name;
	static String institueName;
	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}
	
	{
		System.out.println("instatance block1");
	}
	
	{
		System.out.println("instatance block2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.Rollno=123;
		s1.name="Alex";
		
		System.out.println(s1.Rollno +" "+ s1.name);
		
		Student s2 = new Student();
		s2.Rollno=456;
		s2.name="Michael";
		/*Student s3=new Student();
		s3.Rollno=125;
		s3.name="Alok";
		Student s4 = new Student();
		s4.Rollno=45 ;
		s4.name="Luara";*/
		
		System.out.println(s2.Rollno +" "+s2.name);
		/*System.out.println(s3.Rollno +" "+ s3.name);
		System.out.println(s4.Rollno +" "+ s4.name);*/
	}

}
