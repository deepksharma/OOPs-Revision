package recursion;
// Given 2 number x & y. Find the greatest common divisor of x and y using recursion.

public class GreatestCommonDivision {
    public static int GDC(int x , int y){

        while (x % y != 0){
            int remainder = x % y;
            x = y;
            y = remainder;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(GreatestCommonDivision.GDC(15, 24));
    }
}
