package q;

public class bigNumMultiply {

	 public static void main(String[] args) {  
	  
	        String str1 = "103";  
	        String str2 = "103";  
	  
	        int len1 = str1.length();  
	        int len2 = str2.length();  
	  
	        char[] s1 = str1.toCharArray();  
	        char[] s2 = str2.toCharArray();  
	  
	        System.out.println("乘数："+str1);  
	        System.out.println("乘数："+str2);  
	        multiply(s1, len1, s2, len2);  
	  
	    }  
	  
	    public static void multiply(char a[], int alen, char b[], int blen) {  
	        // 两数乘积位数不会超过乘数位数和+ 3位  
	        int csize = alen + blen + 3;  
	        // 开辟乘积数组  
	        int[] c = new int[csize];  
	        // 乘积数组填充0  
	        for (int i = 0; i < csize; i++) {  
	            c[i] = 0;  
	        }  
	        // 对齐逐位相乘  
	        for (int j = 0; j < blen; j++) {  
	            for (int i = 0; i < alen; i++) {  
	                c[i + j] +=  Integer.parseInt(String.valueOf(a[i]))* Integer.parseInt(String.valueOf(b[j]));  
	            }  
	        }  
	        int m = 0;  
	        // 进位处理  
	        for (m = csize-1; m >=0; m--) {  
	            int carry = c[m] / 10;  
	            c[m] = c[m] % 10;  
	            if (carry > 0)  
	                c[m -1] += carry;  
	        }  
	        // 找到最高位  
	        for (m =csize-1; m >=0;  m--) {  
	            if (c[m] > 0)  
	                break;  
	        }  
	        // 由最高位(非0)开始打印乘积  
	        System.out.print("乘积："+m+"@@");  
	        for (int n = 0; n <= m; n++) {  
	            System.out.print(c[n]);  
	        }  
	        System.out.println("");  
	    }  
	    
}
