package polymorphishm;

class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class RuntimePolymor {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square(), new Shape()};

        for (Shape s : shapes) {
            s.draw();  // What will be printed?
        }
    }
}




