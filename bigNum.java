package q;

public class bigNum {  
	
    public static void main(String[] args) {  
    	
    	  System.out.print(doMinus("11111", "9325"));  
    }  
    
    private static String doMinus(String a, String b)  
    {  
    	 String str = "";  
         int lenA = a.length();  
         int lenB = b.length();  
         if(lenA>=lenB){
        	 int maxLen = (lenA > lenB) ? lenA : lenB;  
             int minLen = (lenA < lenB) ? lenA : lenB;  
             String strTmp = "";  
             for (int i = maxLen - minLen; i > 0; i--)  
             {  
                 strTmp += "0";  
             }  
             b = strTmp + b;
             int JW=0;   //借位
             
             for (int i = maxLen - 1; i >= 0; i--)  
             {  
                 int tempA = Integer.parseInt(String.valueOf(a.charAt(i)));  
                 int tempB = Integer.parseInt(String.valueOf(b.charAt(i)));  
                 int temp=0;  
                 if(i!=0){
                	   if (tempA -tempB - JW < 0)  
                       {   temp = tempA - tempB - JW + 10;  
                           JW = 1;  
                       }  
                       else  
                       {   temp = tempA - tempB - JW;  
                           JW = 0;  
                       }  
                       str = String.valueOf(temp) + str;  
                 }else{
                	 if(tempA -tempB - JW < 0){
                		 str=doMinus(b, a);
                		 
                		 str="-"+str;
                	 }else{
                		temp = tempA - tempB - JW;
                		if(temp!=0)
                        str = String.valueOf(temp) + str;  
                	 }
                 }
             }  
         }else{
        	 str=doMinus(b, a);
        	 
        	 str="-"+str;
         }
         return str;
    }
    
  private static String doAdd(String a, String b)  
    {  
        String str = "";  
        int lenA = a.length();  
        int lenB = b.length();  
        int maxLen = (lenA > lenB) ? lenA : lenB;  
        int minLen = (lenA < lenB) ? lenA : lenB;  
        String strTmp = "";  
        for (int i = maxLen - minLen; i > 0; i--)  
        {  
            strTmp += "0";  
        }  
        //把长度调整到相同  
        if (maxLen == lenA)  
        {  
            b = strTmp + b;  
        }  
        else  
        {  
            a = strTmp + a;  
        }  
        int JW = 0;//进位  
        for (int i = maxLen - 1; i >= 0; i--)  
        {  
            int tempA = Integer.parseInt(String.valueOf(a.charAt(i)));  
            int tempB = Integer.parseInt(String.valueOf(b.charAt(i)));  
            int temp;  
            if (tempA + tempB + JW >= 10 && i != 0)  
            {  
                temp = tempA + tempB + JW - 10;  
                JW = 1;  
            }  
            else  
            {  
                temp = tempA + tempB + JW;  
                JW = 0;  
            }  
            str = String.valueOf(temp) + str;  
        }  
        return str;  
    }  
}  