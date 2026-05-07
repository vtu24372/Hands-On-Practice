import java.util.*;

class MaxAreaOfIsland{
    
    static int dfs(int[][] g, int i, int j){
        
        if(i<0 || j<0 || i>=g.length || j>=g[0].length || g[i][j] == 0)
            return 0;
        
        g[i][j] = 0;

        return 1+
        dfs(g, i+1, j)+
        dfs(g, i-1, j)+
        dfs(g, i, j+1)+
        dfs(g, i, j-1);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int  m = s.nextInt();

        int[][] g = new int[n][m];

        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
        g[i][j] = s.nextInt();

        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                if(g[i][j] == 1)
                    max = Math.max(max,dfs(g,i,j));
                
            }
        }
        System.out.println(max);
    }
}