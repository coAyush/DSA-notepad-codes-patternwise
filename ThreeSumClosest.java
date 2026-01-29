import java.lang.Math;
import java.util.Arrays;
public class ThreeSumClosest{
	public static void main(String [] args){
		System.out.println(closest(new int [] {-1,2,1,-4},1));
	}
	public static int closest(int [] nums,int target){
		Arrays.sort(nums);
		if(nums.length==3){
			return nums[0]+nums[1]+nums[2];
		}
		int n=nums.length,min=Integer.MAX_VALUE,minSum=0;
		for(int k=0;k<n-2;k++){
			int i=k+1,j=n-1;
			while(i<j){
				int a=nums[i],b=nums[j],c=nums[k];
				int sum=a+b+c;
				if(sum==target){
					return sum;
				}
				if(sum<target){
					if(min>Math.abs(sum-target)){
						min=Math.abs(sum-target);
						minSum=sum;
					}
					i++;
				}
				else if(sum>target){
					if(min>Math.abs(sum-target)){
						min=Math.abs(sum-target);
						minSum=sum;
					}
					j--;
				}
			}
		}
		return minSum;
	}
}