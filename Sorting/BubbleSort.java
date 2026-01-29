import java.util.Arrays;
public class BubbleSort{
	public static void main(String [] args){
		int [] arr={2,7,5,3,-5,9};
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++){//this tracks till which position from last the array is sorted
			for(int j=1;j<arr.length-i;j++){
				if(arr[j-1]>arr[j]){
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}