/*You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
Return the length of the longest substring containing the same letter you can get after performing the above operations.

Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
*/
public class LongestRepeatingCharacter{
	public static void main(String[] args){
          System.out.print(longestreplacement("ABAB",2));		
	}
	public static int longestreplacement(String s,int k){
		Map<Character,Integer>map=new HashMap<>();
		int low=0,high=0,max=0,maxFreq=0;
		while(high<s.length()){
			char ch=s.charAt(high);
			map.put(ch,map.getOrDefault(ch,0)+1);
			for(Map.Entry<Character,Integer>m:map.entrySet()){
				int v=map.getValue();
				int k=map.getKey();
				maxFreq=Math.max(v);
			}
			while(high-low>2){
				map.put(s.charAt(low),maap.get(s.charAt(low)-1));
				low++;
			}
			high++;
		}
		return max;
	}
}