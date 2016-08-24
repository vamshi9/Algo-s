import java.util.*;
class A{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String s = sc.next();
		char ch[] = s.toCharArray();
		for(int i=0;i<s.length();i++){
			 if(!(s.substring(i+1,s.length()).contains(ch[i]+""))){
                   System.out.println(ch[i]);
                   break;
			 }
		}
	}
}


import java.util.*;
class A{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		for(int j=0;j<t;j++){
		        String s = sc.next();
				String sn = "";
				int min=-1,max=0;
				for(int i=0;i<s.length();i++){
		             if(sn.contains(s.charAt(i)+"")&&min<max){
		             	min = max;
		             	max = sn.length();
		             	sn = s.charAt(i)+"";
		             }else{
		             	sn = sn.concat(s.charAt(i)+"");
		             	if(i==s.length()-1){
		             		   min = sn.length();
		             	}
		             }
				}
				if(min<max){
					System.out.println(max);
				}else{
					System.out.println(min);
				}
		}	    
	}
}