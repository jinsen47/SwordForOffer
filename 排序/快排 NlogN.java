package q;

public class QuickSort {  
    
   public void quickSort(int[] array,int start,int end)
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
				quickSort(array,start,i-1);
				quickSort(array,i+1,end);
			}	
		}
    
}