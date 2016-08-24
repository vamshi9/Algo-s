import java.util.Scanner;
import java.math.*;
class A{

	public static int minEditDistance(String s1,String s2){

		int dist[][] = new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<=s1.length();i++){
        	for(int j=0;j<=s2.length();j++){
        		if(i==0){
        			dist[i][j] = j;
        			 
        		}else{
        			if(j==0){
        				dist[i][j] = i;
        				 
        			}else{
        				if(s1.charAt(i-1) == s2.charAt(j-1)){
        					dist[i][j] = dist[i-1][j-1];
        				}else{
        					dist[i][j] =1+Math.min(dist[i-1][j-1],Math.min(dist[i-1][j],dist[i][j-1]));
        				}
        			}
        		}
        	}
        }

        return dist[s1.length()][s2.length()];
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int t= sc.nextInt(); 
		for(int i=0;i<t;i++){
			String s1 = sc.next();
			String s2 = sc.next();
			System.out.println(minEditDistance(s1,s2));
		}
	}
}