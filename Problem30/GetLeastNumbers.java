package Problem30;

import java.util.Arrays;

publicclass GetLeastNumbers {
	/*
	 *输入N个整数，找出其中最小的k个数      维护一个k个数字的最大堆
	 */
	public void getLeastNumbers(int[] array,int k)
	{
		if(array==null || k<0 || k>array.length)
			return ;

		int[] kArray=Arrays.copyOfRange(array, 0, k);
		//堆化数组
		buildMaxHeapify(kArray);
		//如果小于kArray[0]，则替换并重排堆（小数下沉）
		for(int i=k;i<array.length;i++)
		{
			if(array[i]<kArray[0])
			{
				kArray[0]=array[i];
				MinHeapFixdown(kArray, 0, k);
			}			
		}
		for(int i:kArray)
			System.out.println(i);
	}
	//保持堆的性质
	public void MinHeapFixdown(int a[], int i, int n)  
	   {  
	       int j, temp;  
	       temp = a[i];  
	       j = 2 * i + 1;  
	       while (j < n)  
	       {  
	           if (j + 1 < n && a[j + 1] > a[j]) //在左右孩子中找最大的  
	               j++;  
	           if (a[j] <= temp)  
	               break;  
	           a[i] = a[j];     //把较小的子结点往上移动,替换它的父结点  
	           i = j;  
	           j = 2 * i + 1;  
	       }  
	       a[i] = temp;  
	   }  
	// 建堆
	private void buildMaxHeapify(int[] array)
	{
		int n=array.length;
		 for (int i = n / 2 - 1; i >= 0; i--)  
		        MinHeapFixdown(array, i, n);  
	}
}
