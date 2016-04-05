package Problem7;

import java.util.Stack;

/**
 * Created by liujia on 14-8-26.
 */
public class CQueue {

	/*用两个栈实现一个队列，完成两个函数appendTail和deletedHead，分别是在队列尾部插入节点和在队列头部删除节点的功能*/
	private Stack<String> stack1=new Stack<String>();
	private Stack<String> stack2=new Stack<String>();
	public void appendTail(String s)//改泛型
	{
		stack1.push(s);
	}
	public String deleteHead() throws Exception
	{
		if(stack2.isEmpty())
		{
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
		}
		if(stack2.isEmpty())
		{
			throw new Exception("队列为空，不能删除");
		}
		return stack2.pop();
	}

}

/*用两个队列实现一个栈*/

public class StackImplementByTwoQueues {  
  

    private LinkedList<Integer> queue1;  
    private LinkedList<Integer> queue2;  
      
    StackImplementByTwoQueues(){  
        queue1=new LinkedList<Integer>();  
        queue2=new LinkedList<Integer>();  
    }  
      
    public Integer pop(){  
        Integer re=null;  
        if(queue1.size()==0&&queue2.size()==0){  
            return null;  
        }  
        if(queue2.size()==0){  
            while(queue1.size()>0){  
                re=queue1.removeFirst();  
                if(queue1.size()!=0){//do not add the last element of queue1 to queue2  
                    queue2.addLast(re);  
                }  
            }  
        }else if (queue1.size()==0){  
            while(queue2.size()>0){  
                re=queue2.removeFirst();  
                if(queue2.size()!=0){//do not add the last element of queue2 to queue1  
                    queue1.addLast(re);  
                }  
            }  
        }  
        return re;  
    }  
    public Integer push(Integer o){  
        if(queue1.size()==0&&queue2.size()==0){  
            queue1.addLast(o);//queue2.addLast(o); is also ok  
        }  
        if(queue1.size()!=0){  
            queue1.addLast(o);  
        }else if(queue2.size()!=0){  
            queue2.addLast(o);  
        }  
        return o;  
    }  