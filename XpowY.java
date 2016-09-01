import java.util.Scanner;
public class XpowY{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for( ;t>0;t--){
      int num = sc.nextInt();
      XpowY obj =  new XpowY();
      boolean value = obj.findValue(num);
      System.out.println(value);
    }
  }
  public static boolean findValue(int num){
    int x=0;
    for(x=2;x<=Math.sqrt(num);x++){
      while(num%x == 0){
        num = num/x;
        if(num==1){
          return true;
        }
      }
    }
    return false;
  }
}
