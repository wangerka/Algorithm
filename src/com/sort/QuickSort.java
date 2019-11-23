package com.sort;

import com.common.Util;

public class QuickSort {

	/**
	 * @param args
	 * 挖坑+分治
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {4,23,2,7,12,34,22,3,6,1,100,35,0,99};
		quickSort(values, 0, values.length-1);
		Util.pirntArray(values);

	}
	
	public static void quickSort(int[] a, int l, int h){
		if(l>h) return;
		int low=l;
		int high=h;
		int key = a[low];//相当于 挖了一个坑，可以把后面的数填进来
		while(low < high){
			while(low < high&&a[high]>key){//外面的low可能小于high，这里循环一次后。high可能=low了。所以要再判断一次
				high--;
			}
			if(a[high]<key){
				a[low] = a[high];
				low++;
			}
			while(low < high&&a[low]<key){
				low++;
			}
			if(a[low]>key){
				a[high]=a[low];
				high--;
			}
		}
		a[low]=key;
		//对左右2个序列排序
		quickSort(a,l,low-1);
		quickSort(a, low+1, h);
	}

}
