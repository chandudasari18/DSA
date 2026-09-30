package DSA;

class Animal {
    public void eat() {
        System.out.println("Animals eat food");
    }
}

class Lion extends Animal {
    public void roar() {
        System.out.println("Lion roars loudly");
    }
}

public class Cub extends Lion {
    public void play() {
        System.out.println("Cub loves to play");
    }

    public static void main(String[] args) {
        Cub cub = new Cub();
        cub.eat();
        cub.roar();
        cub.play();
    }
}
