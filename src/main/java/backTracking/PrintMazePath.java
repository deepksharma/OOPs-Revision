package backTracking;

public class PrintMazePath {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        printMaze(1,1,rows,cols,"");

    }

    private static void printMaze(int sr, int sc, int er, int ec,String s) {

        if(sr>er || sc > ec) return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }

        // go down
        printMaze(sr+1,sc,er,ec,s+"D");
        // go right
        printMaze(sr , sc+1 , er ,ec , s+"R");
    }
}
