import java.util.*;
class A{
	public static String reverseString(String s){

		Stack<String> st = new Stack<String>();
		char ch[] = s.toCharArray();
		String sNew = "";
		int i=0;
		for(char c : ch){
			if(c == ' ' ){
				st.push(sNew+" ");
				sNew = "";
			}else{
				sNew = sNew + c + "";
                if(i == s.length()-1){
                	st.push(sNew );
                }
			}
			i++;
		}
		return getReversedString(st); 
	}

	public static String getReversedString(Stack st){
		int j=st.size();
		String s = "";
		while(j>0){
			s =s + st.pop() + " ";
			j--;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++){		
            String s = sc.nextLine();			
			System.out.println(reverseString(s));
		}
	}
}