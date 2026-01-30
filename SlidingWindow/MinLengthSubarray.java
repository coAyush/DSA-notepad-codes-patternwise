public class MinLengthSubarray{
	public static void main(String [] args){
		int [] arr={1,2,3,4,5,6};
		int target=7;
		int low=0,high=0,sum=0,length=Integer.MAX_VALUE;
		while(high<arr.length){
			sum+=arr[high];
			while(sum>=target){
				sum-=arr[low];
				length=Math.min(length,high-low+1);
				low++;
			}
			high++;
		}
		System.out.println(length);
	}
}