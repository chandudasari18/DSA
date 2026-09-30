package DSA;

public class Array {
    int empid;
    String name;

    public Array(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    public Array() {
       
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", name=" + name + "]";
    }
}
