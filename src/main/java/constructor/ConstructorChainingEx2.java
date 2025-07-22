package constructor;



class Student {
    String name;
    int age;

    // Constructor 1: No-arg constructor
    Student() {
        this("Default Name", 18);  // Calls Constructor 3
        System.out.println("Default constructor called");
    }

    // Constructor 2: One-arg constructor
    Student(String name) {
        this(name, 18);            // Calls Constructor 3
        System.out.println("Constructor with only name called");
    }

    // Constructor 3: Two-arg constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

/*
public class ConstructorChainingEx2 {
    public static void main(String[] args) {
        System.out.println("---- Creating s1 ----");
        Student s1 = new Student();  // Calls Constructor 1

        System.out.println("---- Creating s2 ----");
        Student s2 = new Student("Deepak");  // Calls Constructor 2

        System.out.println("---- Creating s3 ----");
        Student s3 = new Student("Prasad", 25);  // Calls Constructor 3
    }
}
*/
