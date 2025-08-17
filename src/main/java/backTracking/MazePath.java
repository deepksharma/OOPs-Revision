package backTracking;

public class MazePath {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int count = maze(1,1,rows,cols);
        System.out.println(count);
    }

    private static int maze(int startingRow, int startingCol, int endingRow, int endingCol) {
        if(startingRow > endingRow || startingCol > endingCol) return 0;
        if(startingRow == endingRow && startingCol == endingCol) return 1;

        int downWays = maze(startingRow+1, startingCol , endingRow ,endingCol);
        int rightWays = maze(startingRow , startingCol+1, endingRow, endingCol);
        int totalWays = downWays + rightWays;
        return totalWays;

    }
}
