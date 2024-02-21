public class NumOfIslands {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {             //loop through the rows of the grid
            for (int j = 0; j < grid[i].length; j++) {      //loop through the columns of the grid
                if (grid[i][j] == '1') {                    //if the current cell is 1, increment count and call bfs
                    count++;                               
                    bfs(grid, i, j);
                }
            }
        }
        return count;
    }

    //Breadth First Search
    private void bfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') { //check if the current cell is out of bounds or is 0
            return;
        } else {
            grid[i][j] = '0';
            bfs(grid, i + 1, j); //check up
            bfs(grid, i -1, j); //check down
            bfs(grid, i, j-1); //check left
            bfs(grid, i, j+1);  //check right
        }
    }
}