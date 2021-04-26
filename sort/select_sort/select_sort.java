package select_sort;

public class select_sort {
	public static void main(String[] args) {
		int[] arr_1 = {2,10,8,6,7,3,17,1,0};
		selectionSort(arr_1,arr_1.length);
	}
	
	public static void selectionSort(int[] list, int n) {	//n : list의 크기
		System.out.println(" 정렬 전 ==============");
		print(list,n);
		
		int least =0;
	
		for(int i =0;i<n-1;i++) {
			least = i;
			for(int j = i+1;j<n;j++) {
				if(list[least]>list[j]) {
					least = j;
				}
			}
			SWAP(list,i,least);
		}
		
		System.out.println(" 정렬 후 ==============");
		print(list,n);
		
	}
	
	public static void SWAP(int[] list, int curIndex, int leastIndex) {
		int temp = list[leastIndex];
		list[leastIndex] = list[curIndex];
		list[curIndex] = temp;
	}
	
	public static void print(int[] list,int n) {
		System.out.print("[ ");
		for(int i =0;i<n;i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println(" ]");
	}
}

