package DSA;

// to print SubArrays

public class SubArray {
    public static void subArrays(int[] arr){
        for(int i = 0; i < arr.length; i++){           // start index
            for(int j = i; j < arr.length; j++){       // end index
                System.out.print("[");
                for(int k = i; k <= j; k++){           // print from i to j
                    System.out.print(arr[k]);
                    if(k < j) System.out.print(", ");
                }
                System.out.print("]");
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        subArrays(arr);
    }
}
