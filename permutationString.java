import java.util.*;
class A{

	public static HashSet<String> 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0;i<t;i++){
			String s = sc.next();
			HashSet<String> permutations = getAllPermuatations(s);
			System.out.println(permutations);
		}
	}
}