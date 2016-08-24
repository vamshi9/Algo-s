import java.util.*;
public class DNA{

	public static HashSet<String> getAllDuplicates(String s){
		  HashMap<Character,Integer> hMap =  new HashMap<Character,Integer>();
		
			hMap.put('A',1);
			hMap.put('C',2);
			hMap.put('G',3);
			hMap.put('T',4);
		

		HashSet<Integer> hInt = new HashSet<Integer>();
		HashSet<String> hString =  new HashSet<String>();
	    int power = 10;
		for(int i=0,current=0;i<s.length();i++){
			 if(i>9){
                   current = ((current - hMap.get(s.charAt(i-10))*(int)Math.pow(2,10) )*2) + 2*hMap.get(s.charAt(i));
                   if(hInt.contains(current)){
                   	     System.out.println(current);
                   	     System.out.println(s.substring(i-9,i+1));
                         hString.add(s.substring(i-9,i+1));
                   }else{
                   	    hInt.add(current);
                   	    
                   }
			 }else{

                  current = current + hMap.get(s.charAt(i))*(int)Math.pow(2,power);
                  power = power -1;
                  if(i==9){
                  	hInt.add(current);
                  }



			 }
			
		}
		return hString;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			String s = sc.next();
			HashSet<String> hSet =  getAllDuplicates(s);
			// for(String sh : hSet ){
			// 	System.out.println(sh + " ");
			// }
		}
	}
}