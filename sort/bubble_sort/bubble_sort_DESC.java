package bubble_sort;

import data_set.data;

public class bubble_sort_DESC {
	public static void main(String[] args) {
		int[] arr_1 = data.getArr(60000);
				
		double start = System.nanoTime();

		bubbleSortDesc(arr_1,arr_1.length);
		
		double end = System.nanoTime();
		System.out.println("수행 시간 : " + (end-start)/1000000 + "ms");
	}
	
	public static void bubbleSortDesc(int[] list, int n) { //n : list's size;
		//System.out.println(" 정렬 전 ==============");
		//print(list,n);
		
		
		for(int i =n-1;i>0;i--) {
			for(int j = 0;j<i;j++) {
				if(list[j]<list[j+1]) {
					SWAP(list,j+1,j);
				}
			}
		}
		
		//System.out.println(" 정렬 후 ==============");
		//print(list,n);
	}
	
	public static void SWAP(int[] list,int least,int biggest) {
		int temp = list[least];
		list[least] = list[biggest];
		list[biggest] = temp;
	}
	
	public static void print(int[] list,int n) {
		System.out.print("[ ");
		for(int i =0;i<n;i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println(" ]");
	}
}
