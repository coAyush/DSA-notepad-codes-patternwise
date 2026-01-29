import java.util.Arrays;
public class DutchNationalFlag{
	public static void main(String [] args){
		int [] nums={2,0,2,1,1,0};
		System.out.println(Arrays.toString(nums));
		dutchNationalFlag(nums);
		System.out.println(Arrays.toString(nums));
	}
	public static void dutchNationalFlag(int [] nums){
		int start=0,end=nums.length-1,low=0,mid=0,high=nums.length-1;
		while(mid<=high){
			if(nums[mid]==0){
				swap(nums,low,mid);
				low++;
				mid++;
			}
			else if(nums[mid]==1){
				mid++;
			}
			else{
				swap(nums,mid,high);
				high--;
			}
		}
	}
	public static void swap(int [] nums,int left , int right){
		int temp=nums[left];
		nums[left]=nums[right];
		nums[right]=temp;
	}
}