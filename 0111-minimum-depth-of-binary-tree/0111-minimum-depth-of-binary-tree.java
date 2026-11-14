class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int d = 1;
        
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                TreeNode c = q.poll();
                
                
                if (c.left == null && c.right == null) {
                    return d;
                }
                
                if (c.left != null) q.offer(c.left);
                if (c.right != null) q.offer(c.right);
            }
            d++;
        }
        
        return d;
    }
}