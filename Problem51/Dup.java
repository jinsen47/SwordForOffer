package Problem53;

public class Dup {
    /*
     *  判断长度为n的数组中是否有重复数字 0~n-1
     */
    public boolean duplicate(int[] numbers)
    {
        if(numbers==null)
            return false;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<0 || numbers[i]>numbers.length-1)
                return false;

        for(i=0;i<numbers.length;i++) {
            while (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]])
                    return true;

                int temp = numbers[i];
                numbers[i] = numbers[temp];
                numbers[temp] = temp;
            }
        }
        }
        return false;
    }

}