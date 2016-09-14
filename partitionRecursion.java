import java.util.*;
public class PartitionRecursion{
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int set[] = {15,20,15,5,45};
    PartitionRecursion obj = new PartitionRecursion();
    System.out.println(obj.possiblePartition(set));
  }
  public boolean possiblePartition(int[] set){
    int sum = 0;
    for(int i=set.length;i>0;i--){
      sum = sum + set[i];
    }
    if(sum/2!=0){
      return false;
    }
    return findPartition(set,0,sum);
  }

  public boolean findPartition(int set[],int currIndex,int requiredSum){
    if(requiredSum == 0){
      return true;
    }
    return (findPartition( set[],requiredSum-set[currIndex],currIndex+1) || findPartition(set[],requiredSum,currIndex+1));
  }
}
