import java.util.Scanner;
public class MissingNumber{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num =sc.nextInt();
    int arr[] = new int[]{1,2,4,5,6,7};
    MissingNumber obj = new MissingNumber();
    int low = 0;
    int high = arr.length-1;
    int number = obj.findMissingNumber(arr,low,high);
    System.out.println(number);
  }

  public static int findMissingNumber(int arr[],int low,int high){
    if(low>high)
        return -1;
    if(low==high)
        return arr[low]-1;
    int mid = (low+high)/2;
    if(arr[mid]==mid+1){
      low = mid+1;
      return findMissingNumber(arr,low,high);
    }else{
      high = mid;
      return findMissingNumber(arr,low,high);
    }
  }

}
