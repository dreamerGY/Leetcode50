
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return root;
        if(q.val < root.val && p.val < root.val){//如果qp都小于root，对root的左子树进行递归
            return lowestCommonAncestor(root.left,p,q);
        }
        if(q.val >root.val && p.val > root.val){//如果pq都大于root，对root的右子树进行递归
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
            
    }
}
