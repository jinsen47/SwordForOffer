package Problem49;

import java.util.ArrayList;
//字符串转成整数
public class StrToIntCore {

	public long StrToInt(char[] str)throws Exception{
		 
		long num=0;
		int begin=0;
		if(str==null || str.length==0)
			throw new Exception("输入不合法");
		boolean minus=false;
		if(str[0]=='+')
			begin++;
		else if(str[0]=='-'){
			begin++;
			minus=true;
		}
		if(begin!=str.length-1);
		num=StrToIntCoreCore(str,minus,begin);
		return num;
	}
	public long StrToIntCoreCore(char[] dight,boolean minus,int begin) throws Exception
	{
		long num=0;
		int flag=minus?-1:1;
		for(int i=begin;i<dight.length;i++){
			if(dight[i]>='0' && dight[i]<='9'){
				num=num*10 + flag*(dight[i]-'0');
				if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE){
					throw new Exception("大数");
				}
			}else{
				throw new Exception("输入不合法");
			}
		}
		return num;
	}
}