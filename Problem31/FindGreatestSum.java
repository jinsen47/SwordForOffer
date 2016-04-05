package Problem31;

public class FindGreatestSum {
	/*
	 * 连续子数组的最大和
	 */
	public Integer findGreatestSum(int[] array)
	{
		if(array==null)
			return null;
		int greatest=0;
		int curSum=0;
		for(int i=0;i<array.length;i++)
		{
			if(curSum<=0){
				curSum=array[i];
			}
			else{
				curSum+=array[i];
			}

			if(curSum>greatest)
				greatest=curSum;
		}	
		return greatest;
	}
}
