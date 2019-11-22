package com.sort;

import com.common.Util;

public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {4,23,2,7,12,34,22,3,6,1,100,35,0,99};
		
		for(int i =0;i<values.length;i++){
			int index = i;
			for(int j=i;j<values.length;j++){
				if(values[j] < values[index]){
					index = j;
				}
			}
			
			//交换的顺序很重要
			int tmp = values[index];
			values[index]=values[i];
			values[i]=tmp;
		}
		
		Util.pirntArray(values);

	}

}
