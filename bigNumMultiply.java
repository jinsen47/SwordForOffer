package q;

public class bigNumMultiply {

	 public static void main(String[] args) {  
	  
	        String str1 = "103";  
	        String str2 = "103";  
	  
	        int len1 = str1.length();  
	        int len2 = str2.length();  
	  
	        char[] s1 = str1.toCharArray();  
	        char[] s2 = str2.toCharArray();  
	  
	        System.out.println("������"+str1);  
	        System.out.println("������"+str2);  
	        multiply(s1, len1, s2, len2);  
	  
	    }  
	  
	    public static void multiply(char a[], int alen, char b[], int blen) {  
	        // �����˻�λ�����ᳬ������λ����+ 3λ  
	        int csize = alen + blen + 3;  
	        // ���ٳ˻�����  
	        int[] c = new int[csize];  
	        // �˻��������0  
	        for (int i = 0; i < csize; i++) {  
	            c[i] = 0;  
	        }  
	        // ������λ���  
	        for (int j = 0; j < blen; j++) {  
	            for (int i = 0; i < alen; i++) {  
	                c[i + j] +=  Integer.parseInt(String.valueOf(a[i]))* Integer.parseInt(String.valueOf(b[j]));  
	            }  
	        }  
	        int m = 0;  
	        // ��λ����  
	        for (m = csize-1; m >=0; m--) {  
	            int carry = c[m] / 10;  
	            c[m] = c[m] % 10;  
	            if (carry > 0)  
	                c[m -1] += carry;  
	        }  
	        // �ҵ����λ  
	        for (m =csize-1; m >=0;  m--) {  
	            if (c[m] > 0)  
	                break;  
	        }  
	        // �����λ(��0)��ʼ��ӡ�˻�  
	        System.out.print("�˻���"+m+"@@");  
	        for (int n = 0; n <= m; n++) {  
	            System.out.print(c[n]);  
	        }  
	        System.out.println("");  
	    }  
	    
}
