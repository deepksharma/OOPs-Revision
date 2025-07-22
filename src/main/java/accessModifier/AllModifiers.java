package accessModifier;


 class A {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3;
    private int privateVar = 4;

    public void show() {
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Private: " + privateVar);
    }
}
class B extends A {
    void display() {
        System.out.println("Public: " + publicVar);        // ✅
        System.out.println("Protected: " + protectedVar);  // ✅ (inherited)
         System.out.println(defaultVar);                // ❌
//         System.out.println(privateVar);               // ❌
    }
}



public class AllModifiers {
    public static void main(String[] args) {
//        A obj = new A();
//        obj.show();
        B obj2 = new B();
        obj2.display();
    }
}
