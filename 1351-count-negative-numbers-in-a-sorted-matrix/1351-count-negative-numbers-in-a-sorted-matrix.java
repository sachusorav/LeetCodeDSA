class Solution {
    public int countNegatives(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int row = rows - 1; // last row
        int col = 0;        // first column
        int count = 0;

        while (row >= 0 && col < cols) {

            if (grid[row][col] < 0) {
                count += cols - col; // all elements to the right are negative
                row--;
            } else {
                col++;
            }
        }

        return count;

        // int countNegative=0;
        // for(int i=0;i<grid.length;i++){
        //     for(int j =0; j<grid.length;j++){
        //         if(grid[i][j] < 0){
        //             countNegative++;
        //         }
        //     }
        // }
        // return countNegative;
    }
}