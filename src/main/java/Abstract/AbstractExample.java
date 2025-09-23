package constructor;
abstract class  shape{
    void draw(){
        System.out.println("Drawing a shape");
    }
}
   class circle extends shape{}

public class AbstractExample {
    public static void main(String[] args) {

     //   shape s = new shape()    not allowed
        circle c = new circle();
        c.draw();
    }

}
