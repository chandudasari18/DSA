package OOPS;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    public abstract void makeSound();
    public abstract void move();

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }

    @Override
    public void move() {
        System.out.println(name + " runs around happily.");
    }
}
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps melodiously.");
    }

    @Override
    public void move() {
        System.out.println(name + " flies in the sky.");
    }
}
class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 3);
        Animal bird = new Bird("Tweety", 1);

        dog.makeSound();
        dog.move();
        dog.sleep();

        bird.makeSound();
        bird.move();
        bird.sleep();
    }
}
