import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class ThreeSum{
	public static void main(String [] args){
		System.out.print(threeSum(new int []{-1,0,1,2,-1,-4}));
	}
	public static List<List<Integer>> threeSum(int [] nums){
		Arrays.sort(nums);
		int n=nums.length;
		List<List<Integer>>list=new ArrayList<>();
		for(int k=0;k<n-3;k++){
			if(k>0 && nums[k]==nums[k-1]) 
				continue;
			int i=k+1,j=n-1;
			while(i<j){
				int a=nums[i],b=nums[j],c=nums[k];
				int sum=a+b+c;
				if(sum==0){
					list.add(new ArrayList<>(Arrays.asList(a,b,c)));
					i++;
					j--;
					while(nums[i]==nums[i-1]) i++;
					while(nums[j]==nums[j+1]) j--;
				}
				if(sum<0){
					i++;
				}else if(sum>0){
					j--;
				}
			}
		}
		return list;
	}
}
