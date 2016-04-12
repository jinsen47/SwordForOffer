package Problem27;

public class Convert {
	/*
	 * 将二叉搜索树转换成一个排序的双向链表
	 * 返回为头结点
	 */
	public static TreeNode convertBST(TreeNode root) {
	        if (root == null) return null;
	        if (root.left == null && root.right == null) return root;
	        // 1. 左子树构造成双链表, 拿到左子树最左侧结点, 返回时作为本次获得的最左侧结点
	        TreeNode pMostLeft = convertBST(root.left);
	        TreeNode pCur = pMostLeft;
	        // 2. 拿到左子树最右侧的结点, 与根节点相连
	        while (pCur != null && pCur.right != null) {
	            pCur = pCur.right;
	        }
	        if (pCur != null) {
	            pCur.right = root;
	            root.left = pCur;
	        }
		// 3. 右子树构造成双链表, 拿到最左侧结点, 与根节点相连
	        TreeNode pRightChild = convertBST(root.right);
	        if (pRightChild != null) {
	            root.right = pRightChild;
	            pRightChild.left = root;
	        }
	        // 4. 如果左子树为空, 返回根节点作为最左侧结点, 如果左子树不为空, 返回左子树最左侧结点
	        return pMostLeft == null ? root : pMostLeft;
    }

}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
}
