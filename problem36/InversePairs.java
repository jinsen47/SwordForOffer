package problem36;

public class InversePairs {
	/*
	 * 数组中的两个数字如果前面一个数字大于后面一个数字，则这两个数字组成一个逆序对，输入一个数组，求逆序对的总数
	 */
	public int inversePairs(int[] array)
	{
		if(array==null)
			return 0;
		int[] copy=array.clone();
		return mergeSort(array, copy, 0,array.length-1);
	}
	//result为辅助数组
	private int mergeSort(int[] array,int[] result,int start,int end)
	{
		if(start==end){
			result[start]=array[start];
			return 0;
		}
		int mid=(end+start)/2;
		int left=mergeSort(result, array, start, mid);
		int right=mergeSort(result, array, mid+1, end);
		int count=mergearray(array,result,mid,start,end);
		return left+right+count;	
	}
	/*
	 * 计算相邻表中逆序对个数  先递归计算，然后再排序、合并  只不过是先将大的数放入数组
	 */
	 public int mergearray(int[] array,int[] result,int mid,int start,int end)  
	    {  
			int i=mid;
			int j=end;
			int count=0;
			int k=j;
			while(i>=start && j>=mid+1)
			{
	            //存在逆序对
				if(result[i]>result[j])
				{
					array[k--]=result[i--];
					count+=j-mid;
				}
				else {
					if(result[i]<result[j])
						array[k--]=result[j--];
					else
					{   //相等 两个都放入辅助数组
						count+=j-mid-1;
						array[k--]=result[i--];
						array[k--]=result[j--];
					}
				}
			}
			while(i>=start)
				array[k--]=result[i--];
			while(j>=mid+1)
				array[k--]=result[j--];
			return count;	
	}
}

