import java.util.ArrayList;
public class Maze {
    public static void main(String[] args) {
        // System.out.println(count(3,3));
        // path("", 3, 3);
        // System.out.println(pathDiagonal("", 3, 3));
        // boolean[][] board = {
        //     {true, true, true},
        //     {true, false, true},
        //     {true, true, true}
        // };
        // pathrestrictions("", board, 0, 0);
        boolean[][] board2 = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        AllPath("", board2, 0, 0);
    }
    
    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r, c-1);
        return left+right;
    }
    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+"D", r-1, c);
        }
        if(c>1){
            path(p+"R", r, c-1);
        }
    }    

    static ArrayList<String> pathDiagonal(String p, int r, int c){
        if(r==1&&c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1&&c>1){
            list.addAll(pathDiagonal(p+'D', r-1, c-1));
        }
        if(r>1){
            list.addAll(pathDiagonal(p+'V', r-1, c));
        }
        if(c>1){
            list.addAll(pathDiagonal(p+'H', r, c-1));
        }
        return list;
    }
    static void pathrestrictions(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathrestrictions(p+"D", maze, r+1, c);
        }
        if(c<maze[0].length-1){
            pathrestrictions(p+"R", maze, r, c+1);
        }
    }
     static void AllPath(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1){
            AllPath(p+"D", maze, r+1, c);
        }
        if(c<maze[0].length-1){
            AllPath(p+"R", maze, r, c+1);
        }
        if(r>0){
            AllPath(p+'U', maze, r-1, c);
        }
        if(c>0){
            AllPath(p+'L', maze, r, c-1);
        }
        maze[r][c]=true;
    }
}
