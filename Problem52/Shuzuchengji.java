package Problem53;

public class Test52 {
    public static double[] multiply(double[] data) {
        if (data == null || data.length < 2) {
            return null;
        }
        int n=data.length;
        double[] result = new double[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            // 第一步每个result[i]都等于于data[0]*data[1]...data[i-1]
            // 当i=n-1时，此时result[n-1]的结果已经计算出来了【A】
            result[i] = result[i -1] * data[i - 1];
        }
        // tmp保存data[n-1]*data[n-2]...data[i+1]的结果
        double tmp = 1;
        // 第二步求data[n-1]*data[n-2]...data[i+1]
        // 【A】result[n-1]的结果已经计算出来，所以从data.length-2开始操作
        for (int i = n - 2; i >= 0; i--) {
            tmp *= data[i + 1];
            result[i] *= tmp;
        }

        return result;
    }
}
c[i]=a[0]*a[1]....*a[i-1]                     c[i]=c[i-1]*a[i-1]
d[i]=a[i+1]*a[i+2]....*a[n-2]*a[n-1]          d[i]=d[i+1]*a[i+1]