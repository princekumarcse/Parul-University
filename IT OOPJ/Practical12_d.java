class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

interface Pet {
    void play();
}

interface Guard {
    void protect();
}

class Dog extends Animal implements Pet, Guard {

    public void play() {
        System.out.println("Dog is playing");
    }

    public void protect() {
        System.out.println("Dog is protecting");
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Practical12_d {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();      // From Animal
        d.bark();     // Dog's own method
        d.play();     // From Pet interface
        d.protect();  // From Guard interface
    }
}