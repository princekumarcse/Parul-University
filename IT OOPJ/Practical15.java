abstract class Animal {

    // Abstract method
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println("Animal is eating");
    }
}

// First interface
interface Pet {
    void play();
}

// Second interface
interface Guard {
    void protect();
}

// Multiple inheritance using interfaces
class Dog extends Animal implements Pet, Guard {

    // Implementing abstract class method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    // Implementing Pet interface method
    @Override
    public void play() {
        System.out.println("Dog is playing");
    }

    // Implementing Guard interface method
    @Override
    public void protect() {
        System.out.println("Dog is protecting");
    }
}

public class Practical15 {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
        d.play();
        d.protect();
    }
}