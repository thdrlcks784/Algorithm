package merge_sort;

public class merge_sort_ASC {
	
	public static void main(String[] args) {
		int[] arr_1 = new int[]{2,10,8,6,7,3,17,1,0};
		int[] tempArr_1 = new int[arr_1.length];
		System.out.println("정렬전 ==================");
		print(arr_1,arr_1.length);
		mergeSortAsc(arr_1,tempArr_1,0,arr_1.length-1);
		System.out.println("정렬후 ==================");
		print(arr_1,arr_1.length);
		
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
