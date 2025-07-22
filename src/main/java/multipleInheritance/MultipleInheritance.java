package multipleInheritance;

 interface A{
    default void show(){
        System.out.println("Hello from A");
    }

}
interface B{
     default void show(){
         System.out.println("Hi from B");
     }

}

class C implements A,B{
     public void show(){
         System.out.println("Hello from C");
         A.super.show();
         B.super.show();
     }

}
public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
