package thisAndSuper;

class A{
    int x=20;
}
class B extends A{
    int x=40;

    void print(){
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.x);
       obj.print();
    }

}
