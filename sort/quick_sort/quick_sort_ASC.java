package quick_sort;

import data_set.data;

public class quick_sort_ASC {
	public static void main(String[] args) {
		int[] arr_1 = data.getArr(100000000);
		double start = System.nanoTime();

		quickSortAsc(arr_1,0,arr_1.length-1);
		
		double end = System.nanoTime();
		System.out.println("수행 시간 : " + (end-start)/1000000 + "ms");		
		
	}
	
	public static void quickSortAsc(int[] list, int low, int high) {
		if(low>=high) return;
		int mid = partition(list,low,high);
		quickSortAsc(list,low,mid-1);
		quickSortAsc(list,mid,high);
	}
	
	public static int partition(int[] list, int low , int high) {
		int pivot = list[(low+high)/2];
		while(low<=high) {
			while(list[low]<pivot) low++;
			while(list[high]>pivot) high--;
			if(low<=high) {
				SWAP(list,low,high);
				low++;
				high--;
			}
		}
		
		return low;
	}
	
	public static void SWAP(int[] list, int beforeIndex,int afterIndex) {
		int temp = list[beforeIndex];
		list[beforeIndex] = list[afterIndex];
		list[afterIndex] = temp;
	}
	
	public static void print(int[] list, int n) {
		System.out.print("[ ");
		for(int i =0;i<n;i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println(" ]");
	}
}
