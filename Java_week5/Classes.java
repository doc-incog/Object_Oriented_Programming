interface Animal {
    void eat();
    void walk();
}

interface Printable {
    void display();
}

class Cow implements Animal, Printable {
    public void eat() {
        System.out.println("Cow eats grass");
    }

    public void walk() {
        System.out.println("Cow walks on 4 legs");
    }

    public void display() {
        System.out.println("This is a cow");
    }
}

public class Classes {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.eat();
        cow.walk();
        cow.display();
    }
}