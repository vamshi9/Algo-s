import java.util.*;
class A{
	public static void main(String[] args) {
		String s = "521+4*+3-";
		int l = s.length();
		char ch[] = s.toCharArray();
		Stack<Integer> st = new Stack<Integer>();
		if(l>1){
			for(char c : ch){
				if(0<Character.getNumericValue(c)&&Character.getNumericValue(c)<10){
					st.push( Character.getNumericValue(c));
				}
				else{
					switch(c + ""){
						case "+" : st.push( st.pop() + st.pop()); break;
						case "-" : st.push( -st.pop() + st.pop()); break;
						case "/" : st.push( st.pop() / st.pop()); break;
						case "*" : st.push( st.pop() * st.pop()); break;
					}
				}
				//System.out.println(st);
			}
			System.out.println(st);
		}else{
			System.out.println(s);
		}
	}
}
