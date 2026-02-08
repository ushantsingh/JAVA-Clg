public class mazeRat {
    static int n = 4;

    static boolean isSafe(int maze[][], int x, int y, boolean isvisited[][]) {
        return x >= 0 && x < n && y >= 0 && y < n && maze[x][y]==1 && !isvisited[x][y];
    }
    
    static void solve(int maze[][],int x, int y, boolean isvisited[][],String path){
        if (x == n - 1 && y == n - 1) {
            System.out.println(path);
            return;
        }
        isvisited[x][y] = true;

        //  DOWN
        if (isSafe(maze, x + 1, y, isvisited)) {
            solve(maze, x + 1, y, isvisited, path + "D");
        }
        // UP
        if (isSafe(maze, x - 1, y, isvisited)) {
            solve(maze, x - 1, y, isvisited, path + "U");
        }
        // LEFT
        if (isSafe(maze, x, y + 1, isvisited)) {
            solve(maze, x, y + 1, isvisited, path + "L");
        }
        // RIGHT
        if (isSafe(maze, x, y - 1, isvisited)) {
            solve(maze, x, y - 1, isvisited, path + "R");
        }
        isvisited[x][y] = false; 
    }
    public static void main(String[] args) {
        int maze[][] = {
            {1,0,0,0},
            {1,1,0,1},
            {1,1,0,1},
            {1,1,1,1}
        };
        boolean visited[][] = new boolean[n][n];
        if (maze[0][0] == 1) {
            solve(maze, 0, 0, visited, "");
        }
    }
}

