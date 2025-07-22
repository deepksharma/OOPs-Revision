package constructor;

class Student1 {
    String name;
    int age;

    // Constructor 1
    Student1() {
        this("Default Name", 18); // calling Constructor 3
        System.out.println("Default constructor called");
    }

    // Constructor 2
    Student1(String name) {
        this(name, 18); // calling Constructor 3
        System.out.println("Constructor with only name called");
    }

    // Constructor 3
    Student1(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with name and age called");
    }
}

/*
  public class ConstructorChaining {
     public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("------");
        Student s2 = new Student("Deepak");
        System.out.println("------");
        Student s3 = new Student("Prasad", 25);
    }
}*/

