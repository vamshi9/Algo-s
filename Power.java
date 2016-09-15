import java.util.*;
public class Power{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for (int i=0;i<t ;i++ ) {
      int a =sc.nextInt();
      int b =sc.nextInt();
      int number = findPower(a,b);
      System.out.println(number);
    }
  }

  public static int findPower(int a,int b){
    if(b==0){
      return 1;
    }
    if(b%2==0){
      return findPower(a,b/2)*findPower(a,b/2);
    }else{
      return a*findPower(a,b/2)*findPower(a,b/2);
    }
  }
}
