import java.util.Arrays;
public class SelectionSort{
	public static void main(String[] args){
		int [] arr={2,7,5,3,-5,9};
		System.out.println(Arrays.toString(arr));
		//here we pick the smallest element and place it at the first;
		for(int i=0;i<arr.length;i++){
			int small=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[small]){
					//this is done to avoid unnecessary swapping in bubble sort
					small=j;
				}
			}
			swap(arr,i,small);
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void swap(int [] arr, int i, int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}