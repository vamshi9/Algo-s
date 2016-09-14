import java.util.*;
public class SetPartition{
  public static void main(String[] args) {
    int set[] = {15,5,15,20,45};
    SetPartition obj = new SetPartition();
    System.out.println(obj.partitionExists(set));
  }

  public static boolean partitionExists(int set[]){
    int sum = 0;
    for(int i=0;i<set.length;i++){
      sum = sum + set[i];
    } 

    if(sum%2!=0){
      return false;
    }

    return partitionPossible(sum/2,set);
  }

  public static boolean partitionPossible(int reqSum,int[] set){
    boolean[][] sol = new boolean[reqSum+1][set.length+1];
    int numRows = reqSum+1;
    int numCols = set.length+1;

    for(int j=0;j<numCols;j++){
      sol[0][j] = true;
    }
    for(int i=1;i<numRows;i++){
      sol[i][0] = false;
    }

    for(int j=1;j<numCols;j++){
      for (int i=0;i<numRows ;i++ ) {
         if(sol[i][j-1]==true){
           sol[i][j] = true;
           if((i+set[j-1])<numRows){
             sol[(i+set[j-1])][j] =true;
           }
         }else if(sol[i][j] != true){
           sol[i][j] = false;
         }
        }
      }
      return sol[numRows-1][numCols-1];
    }

  }
