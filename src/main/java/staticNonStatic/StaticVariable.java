package staticNonStatic;

 class  student{
    static String college = "IIT";
    String name;

    student(String name){
        this.name = name;
    }
    void display(){
//        String college = "NIT";
        System.out.println(name+ " studies at "+ college);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        student s1 = new student("Deepak");
        student s2 = new student("motor");

        s1.display();
        s2.display();

        student.college = "NIT";
        s1.display();
        s2.display();
    }
}
