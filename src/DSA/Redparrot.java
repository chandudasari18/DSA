package DSA;

class Bird {
    public void fly() {
        System.out.println("Birds can fly");
    }
}

class GreenParrot extends Bird {
    public void color() {
        System.out.println("I am a green parrot");
    }
}

public class Redparrot extends Bird {
    public void color() {
        System.out.println("I am a red parrot");
    }

    public static void main(String[] args) {
        GreenParrot gp = new GreenParrot();
        gp.fly();
        gp.color();

        Redparrot rp = new Redparrot();
        rp.fly();
        rp.color();
    }
}
