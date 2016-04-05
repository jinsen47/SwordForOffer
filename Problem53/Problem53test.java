package Problem47;

public class Problem47test {
	public static void main(String args[])
	{
		 String str1="aaa";
        String str2="a.a";
        String str3="ab*ac*a";
        Compare test=new Compare();
        System.out.println(test.match(str1.toCharArray(),str3.toCharArray()));
    	}

}
