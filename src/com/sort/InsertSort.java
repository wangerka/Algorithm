package com.sort;

import com.common.Util;

public class InsertSort {

	/**
	 * @param args
	 * 有序队列+无序队列
	 * 每次取出无序队列的第一个值和前面的有序队列从后向前比较。如果小于，则把有序序列往后移一位，直到大于等于有序队列时，插入
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] values = {4,23,2,7,12,34,22,3,6,1,100,35,0,99};
		int len = values.length;
		//插入排序
		for(int i=0;i<len-1;i++){
			int current = values[i+1];
			int preindex = i;
			while(preindex>=0&& current<values[preindex]){
				values[preindex+1] = values[preindex];
				preindex--;
			}
			values[preindex+1] = current;
		}
		
		Util.pirntArray(values);
	}

}
