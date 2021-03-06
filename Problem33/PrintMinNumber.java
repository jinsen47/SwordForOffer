package Problem33;

public class PrintMinNumber {
	/*
	 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印出能拼接出的所有数字中的最小的一个
	 */
	public void printMin(int[] array)
	{
		int[] clone=array.clone();
		printMinNumber(clone,0,clone.length-1);
		for(int i:clone)
			System.out.print(i);
	}
	//快排
	public void printMinNumber(int[] array,int start,int end)
	{
			if(start<end)
			{
				int i=start,j=end,x=array[start];
				while(i<j){
					while(i<j && array[j]>=x)
						j--;
					if(i<j)
						array[i++]=array[j];
					while(i<j && array[i]<x)
						i++;
					if(i<j)
						array[j--]=array[i];
				}
                array[i]=x;
				printMinNumber(array,start,i-1);
				printMinNumber(array,i+1,end);
			}	
	}
	//字符串比较大小
	private boolean isSmall(String m,String n)
	{
		String left=m+n;
		String right=n+m;
		boolean result=false;
		for(int i=0;i<left.length();i++)
		{
			if(left.charAt(i)<right.charAt(i))
				return true;
			else if(left.charAt(i)>right.charAt(i))
				return false;
		}
		return result;
	}
}
