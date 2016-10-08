/**
 * Created by Vamshi on 10/8/2016.
 */
import java.util.Scanner;
public class Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Sqrt obj= new Sqrt();
        obj.findSqrt(number);
    }

    public void findSqrt(int number){
        if(number == 0){
            System.out.println(number);
        }else{
            if(number<0){
                double num = findSqrtNumber((-1)*number);
                if(num*num == (-1)*number){
                    System.out.println((int)num+"i");
                }
                else{
                    System.out.println(num+"i");
                }
            }else{
                 double num = findSqrtNumber(number);
                if(num*num == number){
                    System.out.println((int)num);
                }else{
                    System.out.println(num);
                }
            }
        }
    }

    public double findSqrtNumber(double number ){
        double value=number/2,g;

        do{
            g = value;
            value = (g+(number/g))/2;
            //System.out.println("this is value " + value);
        }while (g-value!=0);
        return value;
    }
}
