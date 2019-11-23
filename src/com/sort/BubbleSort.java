package com.sort;

import com.common.Util;

public class BubbleSort {

	/**
	 * @param args
	 * 重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来
	 * 这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {4,23,2,7,12,34,22,3,6,1,100,35,0,99};
		
		for(int i=0;i<values.length;i++){
			for(int j=0;j<values.length-1-i;j++){
				if(values[j]>values[j+1]){
					int tmp = values[j+1];
					values[j+1]= values[j];
					values[j] = tmp;
				}
			}
		}

		Util.pirntArray(values);
	}

}
