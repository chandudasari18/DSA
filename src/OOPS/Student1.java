package OOPS;

public class Student1 {
	int age;
	String name;
	public Student1 (int age,String name ){
		this.age=age;
		this.name=name;
	}
	void display() {
		System.out.println("Name : "+name +"\n Age : "+ age );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1= new Student1(23,"ram");
		s1.display();
	}

}
