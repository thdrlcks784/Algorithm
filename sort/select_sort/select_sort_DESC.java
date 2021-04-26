package select_sort;

import data_set.data;

public class select_sort_DESC {
	public static void main(String[] args) {
		int[] arr_1 = data.getArr(100000);
		double start = System.nanoTime();

		selectionSortDesc(arr_1,arr_1.length);
		
		double end = System.nanoTime();
		System.out.println("수행 시간 : " + (end-start)/1000000 + "ms");	
	}
	
	public static void selectionSortDesc(int[] list, int n) {	//n : list�� ũ��
		System.out.println(" ���� �� ==============");
		print(list,n);
		
		int max =0;
	
		for(int i =0;i<n-1;i++) {
			max = i;
			for(int j = i+1;j<n;j++) {
				if(list[max]<list[j]) {
					max = j;
				}
			}
			SWAP(list,i,max);
		}
		
		System.out.println(" ���� �� ==============");
		print(list,n);
		
	}
	
	public static void SWAP(int[] list, int curIndex, int maxIndex) {
		int temp = list[maxIndex];
		list[maxIndex] = list[curIndex];
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
