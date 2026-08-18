class Parent {
    int number = 100;

    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    int number = 200;

    void show() {
        // this refers to current class object
        System.out.println("Child number: " + this.number);

        // super refers to parent class variable
        System.out.println("Parent number: " + super.number);

        // Calling parent class method using super
        super.display();
    }
}

public class Practical13 {
    public static void main(String[] args) {
        Child c = new Child();

        c.show();
    }
}