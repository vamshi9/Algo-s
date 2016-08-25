import java.util.*;
public class maxSumAfterRotation{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=0;i<t;i++){
      int arrSize = sc.nextInt();
      ArrayList<Integer> arr = new Arraylist<Integer>(arrSize);
      int max=0,j=0;
      for(Integer value : arr){
         arr.add(sc.nextInt);
         max = max+j*value;
         j+=1;
      }
      System.out.println(performRotation(arr,max));
    }
  }

  public static int performRotation(ArrayList<Integer> arr,max){
    for(int i=0;i<arrSize-1;i++){
         int x = arr.remove(arrSize-1);
         arr.add(0,x);
         int value =  findSum(arr,max);
    }
    return value;
  }

  public static int findSum(ArrayList<Integer> arr,max){
    int sum=0,j=0;
      for(Integer value : arr){
        sum = sum + j*value;
        j+=1;
      }
      if(max < sum){
        max =sum;
      }
      return max;
  }
}
