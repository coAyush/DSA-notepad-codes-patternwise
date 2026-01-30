//[1, 2, 1, 2, 3, 2, 2]
import java.util.Map;
import java.util.HashMap;
public class FruitsIntoBasket{
	public static void main(String [] args){
		int [] arr={1, 2, 1, 2, 3, 2, 2};
		int max=0,low=0,high=0;
		Map<Integer,Integer>map=new HashMap<>();
		while(high<arr.length){
			map.put(arr[high],map.getOrDefault(arr[high],0)+1);
			while(map.size()>2){
				if(map.get(arr[low])==1){
					map.remove(arr[low]);
				}else{
				map.put(arr[low],map.get(arr[low])-1);
				}
				low++;
			}
			max=Math.max(max,high-low+1);
			high++; 
		}
		System.out.println(max);
	}
}