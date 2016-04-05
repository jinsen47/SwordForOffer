package Problem26;

public class Clone {
	/*
	 * 复制一个复杂链表
	 */
       //复制每个节点并放在原节点后
	public void cloneNodes(ComplexListNode root)
	{
		ComplexListNode point=root;
		while(point!=null)
		{
			ComplexListNode cloneComplexListNode=new ComplexListNode();
			cloneComplexListNode.next=point.next;
			cloneComplexListNode.data=point.data;
			point.next=cloneComplexListNode;
			point=cloneComplexListNode.next;
		}
	}
       //设置每个clone节点的sibling
	public void connectSiblingNodes(ComplexListNode root)
	{
		ComplexListNode point=root;
		while(point!=null)
		{
			ComplexListNode cloned=point.next;
			if(point.sibling!=null)
				cloned.sibling=point.sibling.next;
			point=cloned.next;
		}
	}
       //拆开链表，返回头结点！
	public ComplexListNode reConnectNodes(ComplexListNode root)
	{
		ComplexListNode point=root.next;
		//因为用到point.next.next 所以判断条件才是while(point.next!=null) 否则就用 while(point!=null)
		while(point.next!=null)
		{
			point.next=point.next.next;
			point=point.next;
		}
		return root.next ;
	}

	public ComplexListNode clone(ComplexListNode root)
	{
		cloneNodes(root);
		connectSiblingNodes(root);
		return reConnectNodes(root);
	}
}

class ComplexListNode
{
	int data;
	ComplexListNode next;
	ComplexListNode sibling;
}
