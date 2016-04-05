package Problem14;

public class Reorder {
    /*
     * 输入一个整数数组，实现一个函数来调整数组中的数字的顺序，使得所有奇数位于数组的前半部分，偶数位于后半部分
     */
    public void order(int[] array)
    {
        if(array==null)
            return ;
        int begin=0;
        int end=array.length-1;
        while(begin<end) {
            while (!isEven(array[begin]))
                begin++;
            while (isEven(array[end]))
                end--;
            if(begin<end){
                int temp=array[begin];
                array[begin]=array[end];
                array[end]=temp;
            }
        }

    }
    private boolean isEven(int n)
    {
        return n%2==0;
    }

}