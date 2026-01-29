import java.util.Arrays;
import java.lang.Math;
public class ThreeSumLess{
	public static void main(String [] args){
		int [] nums= {-2, 0, 1, 3};
		Arrays.sort(nums);
		int target=2;
		int c=countArrays(nums,target);
		System.out.println(c);
	}
	public static int countArrays(int [] arr,int target){
		int minDiff=Integer.MAX_VALUE,count=0,n=arr.length;
		for(int k=0;k<n-2;k++){
			int i=k+1,j=n-1;
			while(i<j){
				int a=arr[i],b=arr[j],c=arr[k];
				int sum=a+b+c;
				if(sum>=target){
					j--;
				}
				else if(sum<target){
					count+=(j-i);
					i++;
		        }
	        }
        }
		return count;
    }
}