package objectClass;

class Emplyoee{
    String name;

    Emplyoee(String name){
        this.name = name;
    }

    public String toString(){
        return " Employee : "+name;
    }

}

public class toStringMethod {
    public static void main(String[] args) {
        Emplyoee emplyoee = new Emplyoee("Deepak");
        System.out.println(emplyoee);
    }
}
