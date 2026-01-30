import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
//Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k. 	Let k=2
//Note: A subarray is a contiguous part of any given array.
public class SubArrayEqualsK{
	public static void main(String [] args){
		int [] arr={100,200,300,400,500,600};
		int low=0,high=0,sum=0,maxSum=0,k=2,n=arr.length;
		for(;high<k;high++){//window reached it size;
			sum+=arr[high];
		}
		maxSum=Math.max(sum,maxSum);
		while(high<arr.length){
			sum-=arr[low];
			low++;
			if(high<n){
				sum+=arr[high];
				maxSum=Math.max(maxSum,sum);
			}
			high++;
		}
		System.out.println(maxSum);
	}
}