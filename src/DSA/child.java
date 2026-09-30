package DSA;

class parent {
    public void m1() {
        System.out.println("Welcome to india");
    }
}

public class child extends parent {
    public void m2() {
        System.out.println("I am from child");
    }

    public static void main(String args[]) {
        child ch = new child();
        ch.m1(); 
        ch.m2();  
    }
}
