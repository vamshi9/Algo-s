import java.util.*;
class A{

	public static HashMap longestSubString(String s){
		char ch[] = s.toCharArray();
		HashMap<Character,Integer> hMap =new  HashMap<Character,Integer>();
		HashMap<Integer, HashMap<Character, Integer>> hMap2 = new HashMap<Integer, HashMap<Character, Integer>>();
		//HashMap s2="";
		int prev =-1,current=0,k=0;
		for(int i=0;i<s.length();i++){
			if(!(hMap.containsKey(ch[i]))){
                 hMap.put(ch[i],i);
                 current =hMap.size();
			}else{
				if(current>prev){
					prev = current;
					hMap2.put(0,new HashMap(hMap));					
					i = hMap.get(ch[i]);
					hMap.clear();
					List<Value> list = new ArrayList<Value>(hMap2.get(0).values()); 
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			String s = sc.next();
			System.out.println(longestSubString(s));
		}
	}
}