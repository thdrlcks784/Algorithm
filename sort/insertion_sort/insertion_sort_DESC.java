package insertion_sort;

public class insertion_sort_DESC {
	public static void main(String[] args) {
		int[] arr_1 = {2,10,8,6,7,3,17,1,0};
		insertionSortDesc(arr_1,arr_1.length);
	}
	
	public static void insertionSortDesc(int[] list,int n) {	//n : list의 크기
		System.out.println(" 정렬 전 ==============");
		print(list,n);
		
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
		
		
		System.out.println(" 정렬 후 ==============");
		print(list,n);
	}

	public static void print(int[] list,int n) {
		System.out.print("[ ");
		for(int i =0;i<n;i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println(" ]");
	}
}
