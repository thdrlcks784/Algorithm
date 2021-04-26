package merge_sort;

import data_set.data;

public class merge_sort_ASC {
	
	public static void main(String[] args) {
		int[] arr_1 = data.getArr(60000);
		int[] tempArr_1 = new int[arr_1.length];
		double start = System.nanoTime();

		mergeSortAsc(arr_1,tempArr_1,0,arr_1.length-1);
		
		double end = System.nanoTime();
		System.out.println("수행 시간 : " + (end-start)/1000000 + "ms");
	}
	
	public static void mergeSortAsc(int[] list, int[] temp,int start, int end) {
		if(start<end) {
			int mid = (start+end)/2;
			mergeSortAsc(list, temp,start,mid);
			mergeSortAsc(list, temp,mid+1,end);
			
			int p = start;
			int q = mid+1;
			int index = p;
			while(p<=mid||q<=end) {
				if(q>end||(p<=mid&&list[p]<=list[q])) {	
					temp[index++] = list[p++];
				}
				else {
					temp[index++] = list[q++];
				}
			}
			
			for(int i =start;i<=end;i++) {
				list[i] = temp[i];
			}
		}
	}
	
	public static void print(int[] list,int n) {
		System.out.print("[ ");
		for(int i =0;i<n;i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println(" ]");
	}
}
