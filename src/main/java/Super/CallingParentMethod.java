package Super;


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound(); // Call parent class method
        System.out.println("Dog barks");
    }
}

public class CallingParentMethod {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

