package Super;


class Parent {
    int age = 50;
}

class Child extends Parent {
    int age = 25;

    void displayAge() {
        System.out.println("Child age: " + age);        // 25
        System.out.println("Parent age: " + super.age); // 50
    }
}

public class AccessParentClass {
    public static void main(String[] args) {
        Child c = new Child();
        c.displayAge();
    }
}


