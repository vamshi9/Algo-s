import java.util.Scanner;
import java.util.Arrays;
class A{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0;i<t;i++){
			String s = sc.next();
			if(s.length()%2 == 0){
				String s1 = s.substring(0,s.length()/2);
				String s2 = s.substring(s.length()/2,s.length());
				System.out.println(minEditDistance(s1,s2));

			}else{
				System.out.println("-1");
			}
		}
	}

	public static int minEditDistance(String s1,String s2){
		char ch[] = s2.toCharArray();
		int count =0;
		for(char c : ch){
			if(!(s1.contains(c + ""))){
				count ++;
				s1=s1.replace(c+"","");
				System.out.print(s1);
			} 
		}
		return count;
	}
	
}