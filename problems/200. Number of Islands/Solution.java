class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        
        int count = 0;
        
        int r = grid.length ;
        int c = grid[0].length ;
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
    
    public void dfs(char[][] grid, int r, int c){
        int row = grid.length;
        int col = grid[0].length;
        if(r < 0 || c < 0 || r >= row || c >= col || grid[r][c] == '0'){
            return;
        }
        
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
}