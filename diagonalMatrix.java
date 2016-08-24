import java.util.*;
public class diagonalMatrix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rowCount = sc.nextInt();
		int colCount = sc.nextInt();
		int matrix[][] = new int[rowCount][colCount];
		int k=1;
		for(int i=0;i<rowCount;i++){
			for (int j=0;j<colCount ;j++ ) {
			    matrix[i][j] = k++;			
			}
		}
		int row,col;
		for(k=0;k<rowCount;k++){
			for(row=k,col=0;row>=0&&col<colCount;row--,col++){
				System.out.print(matrix[row][col] +" ");
			}
			System.out.println();
		}

		for(k=1;k<colCount;k++){
			for(row=rowCount-1,col=k;row>=0&&col<colCount;row--,col++){
				System.out.print(matrix[row][col] +" ");
			}
			System.out.println();
		}    
	}
}