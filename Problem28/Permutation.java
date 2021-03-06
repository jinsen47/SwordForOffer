package Problem28;

public class Permutation {
	/*
	 * 输入一个字符串，打印出字符串中字符的所有排列
	 */
	public void permutation(String str)
	{
		if(str==null)
			return ;
		char[] c=str.toCharArray();
		permutation(c, 0);
	}
	public void permutation(char[] c,int begin){
		
		if(begin==c.length-1)
              System.out.println(String.valueOf(c));
		else{
			for(int i=begin;i<c.length;i++){
				char temp1=c[begin];
				c[begin]=c[i];
				c[i]=temp1;
				
				permutation(c,begin+1);
				
				temp1=c[begin];
				c[begin]=c[i];
				c[i]=temp1;
			}
		}
	}
	 /*
	 * 输入一个字符串，打印出字符串中字符的所有组合
	 */
		public static void combiantion(char chs[]){  
			
		    if(chs.length == 0) return ;  
		      
		    Stack<Character> stack = new Stack<Character>();  

		    for(int i = 1; i <= chs.length; i++){  
		        combine(chs, 0, i, stack);  
		    }  
		}  
		//从字符数组中第begin个字符开始挑选number个字符加入list中  
		public static void combine(char []chs, int begin, int number, Stack<Character> stack){  

		       if(number == 0){  
		        System.out.println(stack.toString());  
		        return ;  
		       }  
		       if(begin == chs.length){  
		        return;  
		       }  
		       stack.push(chs[begin]);  
		       combine(chs, begin + 1, number - 1, stack);  
		       stack.pop();  
		       combine(chs, begin + 1, number, stack);  
		}  

}

