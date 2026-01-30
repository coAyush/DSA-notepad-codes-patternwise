import java.lang.StringBuilder;
public class KUniqueCharacters{
	public static void main(String [] args){
		String s="abcabcbb";
		StringBuilder b=new StringBuilder();
		int high=0,maxLen=Integer.MIN_VALUE;
		while(high<s.length()){
			while(b.indexOf(s.charAt(high)+"")!=-1){
				b.deleteCharAt(0);
		   }	
			b.append(s.charAt(high)+"");
			maxLen=Math.max(maxLen,b.length());
			high++;
		}
		System.out.println(maxLen);
		
	}
}