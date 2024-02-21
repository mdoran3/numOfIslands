public class Main {
    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        NumOfIslands numOfIslands = new NumOfIslands();
        System.out.println(numOfIslands.numIslands(grid));
    }
}