package recursion;

public class PrintMultipleOfK {
    public static void printmultiple(int n , int k){
        if(k == 1){
            System.out.println(n);
            return;
        }
         printmultiple(n , k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        printmultiple(5,4);
    }
}
