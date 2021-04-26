package quick_sort;

public class quick_sort_DESC {
	public static void main(String[] args) {
		int[] arr_1 = {2,10,8,6,7,3,17,1,0};
		int arr_1Length = arr_1.length;
		
		System.out.println("정렬 전 ============");
		print(arr_1,arr_1Length);
		
		quickSortDesc(arr_1,0,arr_1Length-1);
		
		System.out.println("정렬 후 ============");
		print(arr_1,arr_1Length);
	}
	
	public static void quickSortDesc(int[] list, int low, int high) {
		if(low>=high) return;
		int mid = partition(list,low,high);
		quickSortDesc(list,low,mid-1);
		quickSortDesc(list,mid,high);
	}
	
	public static int partition(int[] list, int low , int high) {
		int pivot = list[(low+high)/2];
		while(low<=high) {
			while(list[low]>pivot) low++;
			while(list[high]<pivot) high--;
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
