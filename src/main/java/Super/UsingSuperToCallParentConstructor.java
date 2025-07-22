package Super;

class Parent1 {
    Parent1() {
        System.out.println("Parent Constructor");
    }
}

class Child1 extends Parent1 {
    Child1() {
        super(); // Must be the first line
        System.out.println("Child Constructor");
    }
}

public class UsingSuperToCallParentConstructor {
    public static void main(String[] args) {
        Child1 c = new Child1();
    }
}


