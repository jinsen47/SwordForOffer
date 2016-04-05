package Problem44;

public class IsContinuous {
	
    public boolean isContinuous(int[] array)
 {
     if(array==null || array.length!=5)
         return false;
     int countOf0=0;
     int dis=0;
	 //先排序
     quick_sort(array,0,array.length-1);
     //统计0的个数
     for(int i=0;i<array.length;i++){
         if(array[i]==0)
             countOf0++;
     }
     //统计缺失的个数
	 //跳过所有的0
     int i=countOf0;
     while(i+1<array.length){
         dis+=array[i+1]-array[i]-1;
		 //存在相等则不是顺子
         if(array[i]==array[i+1])
             return false;
         i++;
     }
     if(dis<=countOf0)
         return true;
     else
         return false;
 }
 //快速排序
 public static void quick_sort(int s[], int l, int r)
 {
     if (l < r)
     {
         int i = l, j = r, x = s[l];
         while (i < j)
         {
             while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
                 j--;
             if(i < j)
                 s[i++] = s[j];

             while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                 i++;
             if(i < j)
                 s[j--] = s[i];
         }
         s[i] = x;
         quick_sort(s, l, i - 1); // 递归调用
         quick_sort(s, i + 1, r);
     }
 }
}
