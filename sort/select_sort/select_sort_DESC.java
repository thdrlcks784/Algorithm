package select_sort;

public class select_sort_DESC {
	public static void main(String[] args) {
		int[] arr_1 = {2,10,8,6,7,3,17,1,0};
		selectionSortDesc(arr_1,arr_1.length);
	}
	
	public static void selectionSortDesc(int[] list, int n) {	//n : list의 크기
		System.out.println(" 정렬 전 ==============");
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
		
		System.out.println(" 정렬 후 ==============");
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
