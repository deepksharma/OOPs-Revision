package recursion;

public class SeriesSum {
    public static int seriesSum1(int n){
        if(n == 0){
            return 0;
        }
        return seriesSum1(n-1) + n;
    }

    public static void main(String[] args) {
        System.out.println(SeriesSum.seriesSum1(4));
    }
}
