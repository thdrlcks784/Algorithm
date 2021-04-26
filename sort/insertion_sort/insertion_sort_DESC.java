package insertion_sort;

import data_set.data;

public class insertion_sort_DESC {
	public static void main(String[] args) {
		int[] arr_1 = data.getArr(60000);
		
		double start = System.nanoTime();

		insertionSortDesc(arr_1,arr_1.length);
		
		double end = System.nanoTime();
		System.out.println("수행 시간 : " + (end-start)/1000000 + "ms");
	}
	
	public static void insertionSortDesc(int[] list,int n) {	//n : list�� ũ��
		//System.out.println(" ��� �� ==============");
		//print(list,n);
		
		int key;
		int i;
		int j;
		
		for(i =1;i<n;i++) {
			key = list[i];
			for(j = i-1;j>=0 && list[j]<key;j--) {
				list[j+1] = list[j];
			}
			list[j+1] = key;
		}
		
		
		//System.out.println(" ���� �� ==============");
		//print(list,n);
	}

	public static void print(int[] list,int n) {
		System.out.print("[ ");
		for(int i =0;i<n;i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println(" ]");
	}
}
