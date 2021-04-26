package select_sort;

import data_set.data;

public class select_sort_ASC {
	public static void main(String[] args) {
		int[] arr_1 = data.getArr(100000);
		double start = System.nanoTime();

		selectionSort(arr_1,arr_1.length);
		
		double end = System.nanoTime();
		System.out.println("수행 시간 : " + (end-start)/1000000 + "ms");	

	}
	
	public static void selectionSort(int[] list, int n) {	//n : list 크기
		//System.out.println("정렬 전 ==============");
		//print(list,n);
		
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
		
		//System.out.println("정렬 후 ==============");
		//print(list,n);
		
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

