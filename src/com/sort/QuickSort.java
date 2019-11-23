package com.sort;

import com.common.Util;

public class QuickSort {

	/**
	 * @param args
	 * �ڿ�+����
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
		int key = a[low];//�൱�� ����һ���ӣ����԰Ѻ�����������
		while(low < high){
			while(low < high&&a[high]>key){//�����low����С��high������ѭ��һ�κ�high����=low�ˡ�����Ҫ���ж�һ��
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
		//������2����������
		quickSort(a,l,low-1);
		quickSort(a, low+1, h);
	}

}
