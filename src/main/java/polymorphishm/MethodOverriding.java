package polymorphishm;

class Animal{
    void makeSound(){
        System.out.println("animal make sounds");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
    }
}
