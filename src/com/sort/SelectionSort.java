package com.sort;

import com.common.Util;

public class SelectionSort {

	/**
	 * @param args
	 * ������δ�����������ҵ���С����Ԫ�أ���ŵ��������е���ʼλ�ã�Ȼ���ٴ�ʣ��δ����Ԫ���м���Ѱ����С����Ԫ�أ�Ȼ��ŵ����������е�ĩβ��
	 * �Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ�
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
			
			//������˳�����Ҫ������
			int tmp = values[index];
			values[index]=values[i];
			values[i]=tmp;
		}
		
		Util.pirntArray(values);

	}

}
