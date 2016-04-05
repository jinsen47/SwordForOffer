package Problem32;

public class CountOne {
    // 思路：分别计算“1”在每个位上面出现的次数，叠加起来
    public  int countNumOf1(int n) {
        if (n <= 0) {
            return 0;
        }
        int count = 0;
        int factor = 1;
        int i=0;
        while(n / factor != 0) {
            int lowerNum = n - n / factor * factor;
            int currentNum = (n / factor) % 10;
            int highNum = n / (factor * 10);
            
            if (currentNum == 0) {
                // 如果为0,出现1的次数由高位决定
                count += highNum * factor;
            } else if (currentNum == 1) {
                // 如果为1,出现1的次数由高位和低位决定
                count += highNum * factor + lowerNum + 1;
            } else {
                // 如果大于1,出现1的次数由高位决定 
                count += (highNum + 1) * factor;
            }
            factor *= 10;
            i++;
        }
        return count;
    }
}
例：123

lowernum:         0      3      23

currentnum:       3      2      1

highnum:          12     1      0

count:            13     20     24
