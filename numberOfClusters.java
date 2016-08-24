import java.util.*;
public class numberOfClusters{
	public static void main(String[] args) throws java.lang.NullPointerException {
		 numberOfClusters f = new numberOfClusters();
			int M[][] = new int[][] {
				{1,0,1,0,1},
				{0,1,0,0,0},
				{0,1,0,1,1}
			};

			System.out.println(f.findNumberOfClusters(M));
		
	}

	public static int findNumberOfClusters(int M[][]){
		int count =0;
		boolean visited[][] = new boolean[M.length][M[0].length];
		for(int i=0;i<M.length;i++){
			for(int j=0;j<M[0].length;j++){
				if(M[i][j]==1 && !visited[i][j]){
					DFS(M, i, j,visited);
					++count;
				}
			}
		}
		return count;
	}

	public static void DFS(int M[][],int i,int j,boolean visited[][]){
		if(visited[i][j]){
			return;
		}
		visited[i][j] = true;
		int rowArr[] = {-1,-1,-1,0,0,1,1,1};
		int colArr[] = {-1,0,1,-1,1,-1,0,1};
		for(int k=0;k<8;k++){
			if(check(M,i+rowArr[k],j+colArr[k],visited)){
                  DFS(M,i+rowArr[k],j+colArr[k],visited);
			}
		}

	}

	public static boolean check(int M[][],int row1,int col1,boolean visited[][]) throws ArrayIndexOutOfBoundsException{
		
		if(row1>=0 && col1>=0 && row1 < 3 && col1 < 5) 
		{
		    return (M[row1][col1] == 1) && (row1>=0) && (col1>=0) && (row1<M.length) && (col1<M[0].length);
		}
		return false;
	}
}


/*
mport java.util.Scanner;

public class Solution {

    public static void visit(int[][] ar, boolean[][] v,int i, int j){
        int size = ar.length;
        if(ar[i][j] == 1){
            v[i][j] = true;
            if(j>0 && i<size-1){
                visit(ar,v,i+1,j-1); // SouthWest
            }
            if(i<size-1){
                visit(ar,v,i+1,j); // South
                if(j < size-1)
                    visit(ar,v,i+1,j+1); // SouthEast
            }
            if(j<size-1)
                visit(ar,v,i,j+1); // East
        }
    }
    
    public static void main(String[] args) {
        int[][] ar;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ar = new int[n][n];
        boolean[][] v = new boolean[n][n];
        for(int i=0; i<n ; i++) {
            for(int j=0; j<n; j++){
                ar[i][j] = sc.nextInt();
                v[i][j] = false;
            }
        }
                    
        for(int i=0; i<n ; i++) {
            for(int j=0; j<n; j++){                
                if(ar[i][j] == 1 && !v[i][j]){
                    count++;
                    visit(ar,v,i,j);
                }
            }
        }
        System.out.println(count);
    }
}
*/