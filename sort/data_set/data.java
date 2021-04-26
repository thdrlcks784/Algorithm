package data_set;

import java.util.Random;

public class data {
	
	
	public static int[] getArr(int n) {
		Random rd = new Random();
		int[] arrData = new int[n];
		for(int i =0;i<n;i++) {
			arrData[i] = rd.nextInt(n);
		}
		
		return arrData;
	}
}
