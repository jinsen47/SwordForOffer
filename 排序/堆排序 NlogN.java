package q;
//最小堆
public class MinHeapSort {  
	
       //从i节点开始调整,n为节点总数 从0开始计算 i节点的子节点为 2*i+1, 2*i+2  从根结点将一个数据的“下沉”过程
	   public void MinHeapFixdown(int a[], int i, int n)  
	   {  
	       int j, temp;  
	       temp = a[i];  
	       j = 2 * i + 1;  
	       while (j < n)  
	       {  
	           if (j + 1 < n && a[j + 1] < a[j]) //在左右孩子中找最小的  
	               j++;  
	           if (a[j] >= temp)  
	               break;  
	           a[i] = a[j];     //把较小的子结点往上移动,替换它的父结点  
	           i = j;  
	           j = 2 * i + 1;  
	       }  
	       a[i] = temp;  
	   }  
	   
		//建立最小堆  
		public void MakeMinHeap(int a[], int n)  
		{  
		    for (int i = n / 2 - 1; i >= 0; i--)  
		        MinHeapFixdown(a, i, n);  
		}  
		//最小堆排序  
		public void MinheapsortTodescendarray(int a[], int n)  
		{  
		    for (int i = n - 1; i >= 1; i--)  
		    {  
		        int temp=a[0];
		        a[0]=a[i];
		        a[i]=temp;
		        MinHeapFixdown(a, 0, i);  
		    }  
		}  
		//在最小堆中删除数  
		void MinHeapDeleteNumber(int a[], int n)  
		{  
			 int temp=a[0];
		     a[0]=a[n-1];
		     a[n-1]=temp; 
		     MinHeapFixdown(a, 0, n - 1);  
		}  
	}

	public static void main(String[] args) {
		
		MinHeapSort m=new MinHeapSort();
		int[] a={9,12,17,30,50,20,60,65,4,19};
		
		m.MakeMinHeap(a, a.length);
		for(int i:a)
		System.out.print(i+" ");
		
		m.MinheapsortTodescendarray(a, a.length);
		for(int i:a)
			System.out.print(i+" ");
	}