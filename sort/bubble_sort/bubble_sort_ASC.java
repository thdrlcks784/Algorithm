package bubble_sort;

public class bubble_sort_ASC {
	public static void main(String[] args) {
		int[] arr_1 = {2,10,8,6,7,3,17,1,0};
		bubbleSortAsc(arr_1,arr_1.length);
	}
	
	public static void bubbleSortAsc(int[] list, int n) { //n : list's size;
		System.out.println(" 정렬 전 ==============");
		print(list,n);
		
		
		for(int i =n-1;i>0;i--) {
			for(int j = 0;j<i;j++) {
				if(list[j]>list[j+1]) {
					SWAP(list,j,j+1);
				}
			}
		}
		
		System.out.println(" 정렬 후 ==============");
		print(list,n);
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
