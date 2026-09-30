package OOPS;

public class Studentt{
	int age;
	String name;
	public Studentt(int sage,String sname) {
		age=sage;
		name=sname;
	}
	
	public void display() {
		System.out.println("age: "+age);
		System.out.println("name:"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studentt s1 = new Studentt(23,"ram");
		Studentt s2 = new Studentt(28,"sai");
		
		System.out.println("s1  details  ");
		s1.display();

		System.out.println("s2  details  ");
		s2.display();
		
		
	}

}
