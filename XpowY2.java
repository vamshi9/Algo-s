import java.util.Scanner;
public class XpowY2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (;t>0 ;t-- ) {
      int num = sc.nextInt();
      XpowY2 obj = new XpowY2();
      boolean value = obj.findValue(num);
      System.out.println(value);

    }
  }
  public static boolean findValue(int num){
    int x=0;
    for(x=2;x<=Math.sqrt(num);x++){
      double value = Math.log(num) / Math.log(x);
      if(value - (int)value <= 0.000001){
        return true;
      }
    }
    return false;
  }
}
