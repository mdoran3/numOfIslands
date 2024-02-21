public class Main {
    public static void main(String[] args) {
        char[][] grid1 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        
        char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        
        NumOfIslands numOfIslands = new NumOfIslands();
        System.out.println(numOfIslands.numIslands(grid1)); //run grid1
        System.out.println(numOfIslands.numIslands(grid2)); //run grid2
    }
}