/**
 * Created by Vamshi on 10/9/2016.
 */
import java.util.*;
public class coinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int coins[] = {20,10,5,1};
        coinChange obj = new coinChange();
        obj.findAllWays(amount,coins);
    }
    public void findAllWays(int amount,int coins[]){
        int numberOfWays[][] = new int[coins.length+1][amount+1];
        for (int i=0;i<=coins.length;i++){
            for (int j = 0; j <=amount ; j++) {
                numberOfWays[0][j] =0;
                numberOfWays[i][0]=1;
                if(i>=1&&j>=1){
                    if(coins[i-1]<=j){
                        numberOfWays[i][j] = numberOfWays[i-1][j] + numberOfWays[i][j-coins[i-1]];
                        //System.out.println(numberOfWays[i][j]);
                    }else{
                        numberOfWays[i][j] = numberOfWays[i-1][j];
                    }
                }
            }
        }
        System.out.println(numberOfWays[coins.length][amount]);
    }
}

