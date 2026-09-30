package DSA;

class Grandpha {
    public void tales() {
        System.out.println("without tales we cant slep");
    }
}

class Dad extends Grandpha {
    public void house() {
        System.out.println("hey son dont worry we have 2bhk");
    }
    public void property() {
        System.out.println("i have 1000crore property");
    }
}

public class Grandchild extends Dad {
    public void enjoying() {
        System.out.println("i want enjoy... and slepp and parties");
    }
    public static void main(String args[]) {
        Grandchild gc = new Grandchild();
        gc.tales();
        gc.house();
        gc.property();
        gc.enjoying();
    }
}
