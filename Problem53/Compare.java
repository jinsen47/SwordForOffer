package Problem53;

public class Compare {
    /*
     *  输入两个字符串进行正则表达式匹配 .和*
     */
    public boolean match(char[] str,char[] pattern)
    {
         if(str==null||pattern==null)
              return false;
         return matchCore(str,pattern,0,0);
    }
    public boolean matchCore(char[] str,char[] pattern,int start1,int start2){

        if(start1==str.length && start2>=pattern.length)
            return true;
        if(start1!=str.length && start2>=pattern.length)
            return false;
        //先判断
        if(pattern[start2+1]=='*'){
            if(str[start1]==pattern[start2] || pattern[start2]=='.')
                return matchCore(str, pattern, start1+1, start2+2) || 
                         matchCore(str, pattern, start1, start2+2) ||
                         matchCore(str, pattern, start1+1, start2);
            else
                return matchCore(str, pattern, start1, start2+2);
        }

        if(str[start1]==pattern[start2] || pattern[start2]=='.')
         return matchCore(str,pattern,start1+1,start2+1);

        return false;
    }

}
}
