package Problem29;

class MoreThanHalfNum {
	/*
	 * 数组中有一个数字出现的次数超过数组长度的一般，求这个数字
	 */
	public Integer moreThanHalfNum(int[] array)
	{
		if(array==null)
			return null;
		int result=array[0];
		int count=1;
		for(int i=1;i<array.length;i++)
		{
			if(count==0){
				result=array[i];
				count=1;
			}
			else if(result==array[i]){
				count++;
			}else
				count--;
		}
		if(!checkMoreThanHalf(array, result))
			return null;
		
			return result;
	}
	private boolean checkMoreThanHalf(int[] array,int number)
	{
		int times=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==number)
				times++;
		}
		if(times*2<=array.length)
			return false;
		else 
			return true;
			
	}
}
