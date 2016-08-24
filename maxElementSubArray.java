import java.util.*;
 public class maxElementSubArray{
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for (int i=0;i<t ;i++ ) {
         int arrSize = sc.nextInt();
         int arr[] = new int[arrSize];
         for(int j=0;j<arrSize;j++){
             arr[j] = sc.nextInt();
             //System.out.println(arr[j]);
         }
         int count =0;
         for(int k=0;k<arrSize;k++){
           if(k+3==arrSize)
              break;
           int max=-1;

           for(int l=k;k+3<arrSize && l<k+4;l++){

               if(max<arr[l])
                   max = arr[l];

           }
               System.out.println(max);
         }
       }
  }


}
