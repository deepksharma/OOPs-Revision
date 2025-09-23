package constructor;

class Parent{
    Parent(){
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child Constructor");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

    }
}
