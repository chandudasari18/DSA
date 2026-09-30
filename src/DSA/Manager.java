package DSA;

class Person {
    public void identity() {
        System.out.println("I am a person");
    }
}

class Employee extends Person {
    public void work() {
        System.out.println("I am an employee working");
    }
}

public class Manager extends Employee {
    public void manage() {
        System.out.println("I am a manager managing employees");
    }

    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.identity();
        mgr.work();
        mgr.manage();
    }
}
